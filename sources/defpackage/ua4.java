package defpackage;
public final class ua4 {
    public static final ua4 b;
    public static final ua4 c;
    public static final ua4[] d;
    public static final ua4[] e;
    public final byte a;
    ua4 EF0;

    static {
        dv5 dv5Var = dv5.DOUBLE;
        ua4 ua4Var = new ua4("DOUBLE", 0, 0, 1, dv5Var);
        dv5 dv5Var2 = dv5.FLOAT;
        ua4 ua4Var2 = new ua4("FLOAT", 1, 1, 1, dv5Var2);
        dv5 dv5Var3 = dv5.LONG;
        ua4 ua4Var3 = new ua4("INT64", 2, 2, 1, dv5Var3);
        ua4 ua4Var4 = new ua4("UINT64", 3, 3, 1, dv5Var3);
        dv5 dv5Var4 = dv5.INT;
        ua4 ua4Var5 = new ua4("INT32", 4, 4, 1, dv5Var4);
        ua4 ua4Var6 = new ua4("FIXED64", 5, 5, 1, dv5Var3);
        ua4 ua4Var7 = new ua4("FIXED32", 6, 6, 1, dv5Var4);
        dv5 dv5Var5 = dv5.BOOLEAN;
        ua4 ua4Var8 = new ua4("BOOL", 7, 7, 1, dv5Var5);
        dv5 dv5Var6 = dv5.STRING;
        ua4 ua4Var9 = new ua4("STRING", 8, 8, 1, dv5Var6);
        dv5 dv5Var7 = dv5.MESSAGE;
        ua4 ua4Var10 = new ua4("MESSAGE", 9, 9, 1, dv5Var7);
        dv5 dv5Var8 = dv5.BYTE_STRING;
        ua4 ua4Var11 = new ua4("BYTES", 10, 10, 1, dv5Var8);
        ua4 ua4Var12 = new ua4("UINT32", 11, 11, 1, dv5Var4);
        dv5 dv5Var9 = dv5.ENUM;
        ua4 ua4Var13 = new ua4("ENUM", 12, 12, 1, dv5Var9);
        ua4 ua4Var14 = new ua4("SFIXED32", 13, 13, 1, dv5Var4);
        ua4 ua4Var15 = new ua4("SFIXED64", 14, 14, 1, dv5Var3);
        ua4 ua4Var16 = new ua4("SINT32", 15, 15, 1, dv5Var4);
        ua4 ua4Var17 = new ua4("SINT64", 16, 16, 1, dv5Var3);
        ua4 ua4Var18 = new ua4("GROUP", 17, 17, 1, dv5Var7);
        ua4 ua4Var19 = new ua4("DOUBLE_LIST", 18, 18, 2, dv5Var);
        ua4 ua4Var20 = new ua4("FLOAT_LIST", 19, 19, 2, dv5Var2);
        ua4 ua4Var21 = new ua4("INT64_LIST", 20, 20, 2, dv5Var3);
        ua4 ua4Var22 = new ua4("UINT64_LIST", 21, 21, 2, dv5Var3);
        ua4 ua4Var23 = new ua4("INT32_LIST", 22, 22, 2, dv5Var4);
        ua4 ua4Var24 = new ua4("FIXED64_LIST", 23, 23, 2, dv5Var3);
        ua4 ua4Var25 = new ua4("FIXED32_LIST", 24, 24, 2, dv5Var4);
        ua4 ua4Var26 = new ua4("BOOL_LIST", 25, 25, 2, dv5Var5);
        ua4 ua4Var27 = new ua4("STRING_LIST", 26, 26, 2, dv5Var6);
        ua4 ua4Var28 = new ua4("MESSAGE_LIST", 27, 27, 2, dv5Var7);
        ua4 ua4Var29 = new ua4("BYTES_LIST", 28, 28, 2, dv5Var8);
        ua4 ua4Var30 = new ua4("UINT32_LIST", 29, 29, 2, dv5Var4);
        ua4 ua4Var31 = new ua4("ENUM_LIST", 30, 30, 2, dv5Var9);
        ua4 ua4Var32 = new ua4("SFIXED32_LIST", 31, 31, 2, dv5Var4);
        ua4 ua4Var33 = new ua4("SFIXED64_LIST", 32, 32, 2, dv5Var3);
        ua4 ua4Var34 = new ua4("SINT32_LIST", 33, 33, 2, dv5Var4);
        ua4 ua4Var35 = new ua4("SINT64_LIST", 34, 34, 2, dv5Var3);
        ua4 ua4Var36 = new ua4("DOUBLE_LIST_PACKED", 35, 35, 3, dv5Var);
        b = ua4Var36;
        ua4 ua4Var37 = new ua4("FLOAT_LIST_PACKED", 36, 36, 3, dv5Var2);
        ua4 ua4Var38 = new ua4("INT64_LIST_PACKED", 37, 37, 3, dv5Var3);
        ua4 ua4Var39 = new ua4("UINT64_LIST_PACKED", 38, 38, 3, dv5Var3);
        ua4 ua4Var40 = new ua4("INT32_LIST_PACKED", 39, 39, 3, dv5Var4);
        ua4 ua4Var41 = new ua4("FIXED64_LIST_PACKED", 40, 40, 3, dv5Var3);
        ua4 ua4Var42 = new ua4("FIXED32_LIST_PACKED", 41, 41, 3, dv5Var4);
        ua4 ua4Var43 = new ua4("BOOL_LIST_PACKED", 42, 42, 3, dv5Var5);
        ua4 ua4Var44 = new ua4("UINT32_LIST_PACKED", 43, 43, 3, dv5Var4);
        ua4 ua4Var45 = new ua4("ENUM_LIST_PACKED", 44, 44, 3, dv5Var9);
        ua4 ua4Var46 = new ua4("SFIXED32_LIST_PACKED", 45, 45, 3, dv5Var4);
        ua4 ua4Var47 = new ua4("SFIXED64_LIST_PACKED", 46, 46, 3, dv5Var3);
        ua4 ua4Var48 = new ua4("SINT32_LIST_PACKED", 47, 47, 3, dv5Var4);
        ua4 ua4Var49 = new ua4("SINT64_LIST_PACKED", 48, 48, 3, dv5Var3);
        c = ua4Var49;
        e = new ua4[]{ua4Var, ua4Var2, ua4Var3, ua4Var4, ua4Var5, ua4Var6, ua4Var7, ua4Var8, ua4Var9, ua4Var10, ua4Var11, ua4Var12, ua4Var13, ua4Var14, ua4Var15, ua4Var16, ua4Var17, ua4Var18, ua4Var19, ua4Var20, ua4Var21, ua4Var22, ua4Var23, ua4Var24, ua4Var25, ua4Var26, ua4Var27, ua4Var28, ua4Var29, ua4Var30, ua4Var31, ua4Var32, ua4Var33, ua4Var34, ua4Var35, ua4Var36, ua4Var37, ua4Var38, ua4Var39, ua4Var40, ua4Var41, ua4Var42, ua4Var43, ua4Var44, ua4Var45, ua4Var46, ua4Var47, ua4Var48, ua4Var49, new ua4("GROUP_LIST", 49, 49, 2, dv5Var7), new ua4("MAP", 50, 50, 4, dv5.VOID)};
        ua4[] values = values();
        d = new ua4[values.length];
        for (ua4 ua4Var50 : values) {
            d[ua4Var50.a] = ua4Var50;
        }
    }

    public ua4(String str, int i, int i2, int i3, dv5 dv5Var) {
        this.a = i2;
        int F = ik8.F(i3);
        if (F != 1) {
            if (F == 3) {
                Class cls = dv5Var.a;
            }
        } else {
            Class cls2 = dv5Var.a;
        }
        if (i3 == 1) {
            dv5Var.ordinal();
        }
    }

    public static ua4 valueOf(String str) {
        return (ua4) Enum.valueOf(ua4.class, str);
    }

    public static ua4[] values() {
        return (ua4[]) e.clone();
    }
}
