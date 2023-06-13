package com.foresee.mbg.mapper;

import com.foresee.mbg.model.TFruit;

public interface TFruitMapper {
    int deleteByPrimaryKey(Integer fid);

    int insert(TFruit row);

    int insertSelective(TFruit row);

    TFruit selectByPrimaryKey(Integer fid);

    int updateByPrimaryKeySelective(TFruit row);

    int updateByPrimaryKey(TFruit row);
}