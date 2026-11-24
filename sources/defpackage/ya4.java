package defpackage;
public final class ya4 {
    public static final ya4 b;
    public static final ya4 c;
    public static final ya4[] d;
    public static final ya4[] e;
    public final byte a;
    ya4 EF0;

    static {
        zu5 zu5Var = zu5.DOUBLE;
        ya4 ya4Var = new ya4("DOUBLE", 0, 0, 1, zu5Var);
        zu5 zu5Var2 = zu5.FLOAT;
        ya4 ya4Var2 = new ya4("FLOAT", 1, 1, 1, zu5Var2);
        zu5 zu5Var3 = zu5.LONG;
        ya4 ya4Var3 = new ya4("INT64", 2, 2, 1, zu5Var3);
        ya4 ya4Var4 = new ya4("UINT64", 3, 3, 1, zu5Var3);
        zu5 zu5Var4 = zu5.INT;
        ya4 ya4Var5 = new ya4("INT32", 4, 4, 1, zu5Var4);
        ya4 ya4Var6 = new ya4("FIXED64", 5, 5, 1, zu5Var3);
        ya4 ya4Var7 = new ya4("FIXED32", 6, 6, 1, zu5Var4);
        zu5 zu5Var5 = zu5.BOOLEAN;
        ya4 ya4Var8 = new ya4("BOOL", 7, 7, 1, zu5Var5);
        zu5 zu5Var6 = zu5.STRING;
        ya4 ya4Var9 = new ya4("STRING", 8, 8, 1, zu5Var6);
        zu5 zu5Var7 = zu5.MESSAGE;
        ya4 ya4Var10 = new ya4("MESSAGE", 9, 9, 1, zu5Var7);
        zu5 zu5Var8 = zu5.BYTE_STRING;
        ya4 ya4Var11 = new ya4("BYTES", 10, 10, 1, zu5Var8);
        ya4 ya4Var12 = new ya4("UINT32", 11, 11, 1, zu5Var4);
        zu5 zu5Var9 = zu5.ENUM;
        ya4 ya4Var13 = new ya4("ENUM", 12, 12, 1, zu5Var9);
        ya4 ya4Var14 = new ya4("SFIXED32", 13, 13, 1, zu5Var4);
        ya4 ya4Var15 = new ya4("SFIXED64", 14, 14, 1, zu5Var3);
        ya4 ya4Var16 = new ya4("SINT32", 15, 15, 1, zu5Var4);
        ya4 ya4Var17 = new ya4("SINT64", 16, 16, 1, zu5Var3);
        ya4 ya4Var18 = new ya4("GROUP", 17, 17, 1, zu5Var7);
        ya4 ya4Var19 = new ya4("DOUBLE_LIST", 18, 18, 2, zu5Var);
        ya4 ya4Var20 = new ya4("FLOAT_LIST", 19, 19, 2, zu5Var2);
        ya4 ya4Var21 = new ya4("INT64_LIST", 20, 20, 2, zu5Var3);
        ya4 ya4Var22 = new ya4("UINT64_LIST", 21, 21, 2, zu5Var3);
        ya4 ya4Var23 = new ya4("INT32_LIST", 22, 22, 2, zu5Var4);
        ya4 ya4Var24 = new ya4("FIXED64_LIST", 23, 23, 2, zu5Var3);
        ya4 ya4Var25 = new ya4("FIXED32_LIST", 24, 24, 2, zu5Var4);
        ya4 ya4Var26 = new ya4("BOOL_LIST", 25, 25, 2, zu5Var5);
        ya4 ya4Var27 = new ya4("STRING_LIST", 26, 26, 2, zu5Var6);
        ya4 ya4Var28 = new ya4("MESSAGE_LIST", 27, 27, 2, zu5Var7);
        ya4 ya4Var29 = new ya4("BYTES_LIST", 28, 28, 2, zu5Var8);
        ya4 ya4Var30 = new ya4("UINT32_LIST", 29, 29, 2, zu5Var4);
        ya4 ya4Var31 = new ya4("ENUM_LIST", 30, 30, 2, zu5Var9);
        ya4 ya4Var32 = new ya4("SFIXED32_LIST", 31, 31, 2, zu5Var4);
        ya4 ya4Var33 = new ya4("SFIXED64_LIST", 32, 32, 2, zu5Var3);
        ya4 ya4Var34 = new ya4("SINT32_LIST", 33, 33, 2, zu5Var4);
        ya4 ya4Var35 = new ya4("SINT64_LIST", 34, 34, 2, zu5Var3);
        ya4 ya4Var36 = new ya4("DOUBLE_LIST_PACKED", 35, 35, 3, zu5Var);
        b = ya4Var36;
        ya4 ya4Var37 = new ya4("FLOAT_LIST_PACKED", 36, 36, 3, zu5Var2);
        ya4 ya4Var38 = new ya4("INT64_LIST_PACKED", 37, 37, 3, zu5Var3);
        ya4 ya4Var39 = new ya4("UINT64_LIST_PACKED", 38, 38, 3, zu5Var3);
        ya4 ya4Var40 = new ya4("INT32_LIST_PACKED", 39, 39, 3, zu5Var4);
        ya4 ya4Var41 = new ya4("FIXED64_LIST_PACKED", 40, 40, 3, zu5Var3);
        ya4 ya4Var42 = new ya4("FIXED32_LIST_PACKED", 41, 41, 3, zu5Var4);
        ya4 ya4Var43 = new ya4("BOOL_LIST_PACKED", 42, 42, 3, zu5Var5);
        ya4 ya4Var44 = new ya4("UINT32_LIST_PACKED", 43, 43, 3, zu5Var4);
        ya4 ya4Var45 = new ya4("ENUM_LIST_PACKED", 44, 44, 3, zu5Var9);
        ya4 ya4Var46 = new ya4("SFIXED32_LIST_PACKED", 45, 45, 3, zu5Var4);
        ya4 ya4Var47 = new ya4("SFIXED64_LIST_PACKED", 46, 46, 3, zu5Var3);
        ya4 ya4Var48 = new ya4("SINT32_LIST_PACKED", 47, 47, 3, zu5Var4);
        ya4 ya4Var49 = new ya4("SINT64_LIST_PACKED", 48, 48, 3, zu5Var3);
        c = ya4Var49;
        e = new ya4[]{ya4Var, ya4Var2, ya4Var3, ya4Var4, ya4Var5, ya4Var6, ya4Var7, ya4Var8, ya4Var9, ya4Var10, ya4Var11, ya4Var12, ya4Var13, ya4Var14, ya4Var15, ya4Var16, ya4Var17, ya4Var18, ya4Var19, ya4Var20, ya4Var21, ya4Var22, ya4Var23, ya4Var24, ya4Var25, ya4Var26, ya4Var27, ya4Var28, ya4Var29, ya4Var30, ya4Var31, ya4Var32, ya4Var33, ya4Var34, ya4Var35, ya4Var36, ya4Var37, ya4Var38, ya4Var39, ya4Var40, ya4Var41, ya4Var42, ya4Var43, ya4Var44, ya4Var45, ya4Var46, ya4Var47, ya4Var48, ya4Var49, new ya4("GROUP_LIST", 49, 49, 2, zu5Var7), new ya4("MAP", 50, 50, 4, zu5.VOID)};
        ya4[] values = values();
        d = new ya4[values.length];
        for (ya4 ya4Var50 : values) {
            d[ya4Var50.a] = ya4Var50;
        }
    }

    public ya4(String str, int i, int i2, int i3, zu5 zu5Var) {
        this.a = i2;
        int F = wi8.F(i3);
        if (F != 1) {
            if (F == 3) {
                Class cls = zu5Var.a;
            }
        } else {
            Class cls2 = zu5Var.a;
        }
        if (i3 == 1) {
            zu5Var.ordinal();
        }
    }

    public static ya4 valueOf(String str) {
        return (ya4) Enum.valueOf(ya4.class, str);
    }

    public static ya4[] values() {
        return (ya4[]) e.clone();
    }
}
