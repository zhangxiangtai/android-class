package com.example.middleexam

data class Commodity(
    val id: Int,
    val name:String,
    val price:Double,
    val quantity:Int,
    val description:String
)
data class Equipment(
    val id: Int,
    val name:String,
    val type: String,
    val status:String,
    val manufacturer:String
)

object UserData{
    val commodityList = listOf(
        Commodity(1,"物品1",100.0,10,"一个物品1"),
        Commodity(2,"物品2",200.0,11,"一个物品2"),
        Commodity(3,"物品3",300.0,12,"一个物品3"),
    )
    val equipmentList = listOf(
        Equipment(1,"武器1","类型A","可用","制造商1"),
        Equipment(2,"武器2","类型B","可用","制造商2"),
        Equipment(3,"武器3","类型C","可用","制造商3"),
    )
}
