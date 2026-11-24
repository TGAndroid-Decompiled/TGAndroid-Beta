package defpackage;
public final class y84 {
    public static final y84 b;
    public static final y84 c;
    public static final y84[] d;
    public static final y84[] e;
    public final byte a;
    y84 EF0;

    static {
        at5 at5Var = at5.DOUBLE;
        y84 y84Var = new y84("DOUBLE", 0, 0, 1, at5Var);
        at5 at5Var2 = at5.FLOAT;
        y84 y84Var2 = new y84("FLOAT", 1, 1, 1, at5Var2);
        at5 at5Var3 = at5.LONG;
        y84 y84Var3 = new y84("INT64", 2, 2, 1, at5Var3);
        y84 y84Var4 = new y84("UINT64", 3, 3, 1, at5Var3);
        at5 at5Var4 = at5.INT;
        y84 y84Var5 = new y84("INT32", 4, 4, 1, at5Var4);
        y84 y84Var6 = new y84("FIXED64", 5, 5, 1, at5Var3);
        y84 y84Var7 = new y84("FIXED32", 6, 6, 1, at5Var4);
        at5 at5Var5 = at5.BOOLEAN;
        y84 y84Var8 = new y84("BOOL", 7, 7, 1, at5Var5);
        at5 at5Var6 = at5.STRING;
        y84 y84Var9 = new y84("STRING", 8, 8, 1, at5Var6);
        at5 at5Var7 = at5.MESSAGE;
        y84 y84Var10 = new y84("MESSAGE", 9, 9, 1, at5Var7);
        at5 at5Var8 = at5.BYTE_STRING;
        y84 y84Var11 = new y84("BYTES", 10, 10, 1, at5Var8);
        y84 y84Var12 = new y84("UINT32", 11, 11, 1, at5Var4);
        at5 at5Var9 = at5.ENUM;
        y84 y84Var13 = new y84("ENUM", 12, 12, 1, at5Var9);
        y84 y84Var14 = new y84("SFIXED32", 13, 13, 1, at5Var4);
        y84 y84Var15 = new y84("SFIXED64", 14, 14, 1, at5Var3);
        y84 y84Var16 = new y84("SINT32", 15, 15, 1, at5Var4);
        y84 y84Var17 = new y84("SINT64", 16, 16, 1, at5Var3);
        y84 y84Var18 = new y84("GROUP", 17, 17, 1, at5Var7);
        y84 y84Var19 = new y84("DOUBLE_LIST", 18, 18, 2, at5Var);
        y84 y84Var20 = new y84("FLOAT_LIST", 19, 19, 2, at5Var2);
        y84 y84Var21 = new y84("INT64_LIST", 20, 20, 2, at5Var3);
        y84 y84Var22 = new y84("UINT64_LIST", 21, 21, 2, at5Var3);
        y84 y84Var23 = new y84("INT32_LIST", 22, 22, 2, at5Var4);
        y84 y84Var24 = new y84("FIXED64_LIST", 23, 23, 2, at5Var3);
        y84 y84Var25 = new y84("FIXED32_LIST", 24, 24, 2, at5Var4);
        y84 y84Var26 = new y84("BOOL_LIST", 25, 25, 2, at5Var5);
        y84 y84Var27 = new y84("STRING_LIST", 26, 26, 2, at5Var6);
        y84 y84Var28 = new y84("MESSAGE_LIST", 27, 27, 2, at5Var7);
        y84 y84Var29 = new y84("BYTES_LIST", 28, 28, 2, at5Var8);
        y84 y84Var30 = new y84("UINT32_LIST", 29, 29, 2, at5Var4);
        y84 y84Var31 = new y84("ENUM_LIST", 30, 30, 2, at5Var9);
        y84 y84Var32 = new y84("SFIXED32_LIST", 31, 31, 2, at5Var4);
        y84 y84Var33 = new y84("SFIXED64_LIST", 32, 32, 2, at5Var3);
        y84 y84Var34 = new y84("SINT32_LIST", 33, 33, 2, at5Var4);
        y84 y84Var35 = new y84("SINT64_LIST", 34, 34, 2, at5Var3);
        y84 y84Var36 = new y84("DOUBLE_LIST_PACKED", 35, 35, 3, at5Var);
        b = y84Var36;
        y84 y84Var37 = new y84("FLOAT_LIST_PACKED", 36, 36, 3, at5Var2);
        y84 y84Var38 = new y84("INT64_LIST_PACKED", 37, 37, 3, at5Var3);
        y84 y84Var39 = new y84("UINT64_LIST_PACKED", 38, 38, 3, at5Var3);
        y84 y84Var40 = new y84("INT32_LIST_PACKED", 39, 39, 3, at5Var4);
        y84 y84Var41 = new y84("FIXED64_LIST_PACKED", 40, 40, 3, at5Var3);
        y84 y84Var42 = new y84("FIXED32_LIST_PACKED", 41, 41, 3, at5Var4);
        y84 y84Var43 = new y84("BOOL_LIST_PACKED", 42, 42, 3, at5Var5);
        y84 y84Var44 = new y84("UINT32_LIST_PACKED", 43, 43, 3, at5Var4);
        y84 y84Var45 = new y84("ENUM_LIST_PACKED", 44, 44, 3, at5Var9);
        y84 y84Var46 = new y84("SFIXED32_LIST_PACKED", 45, 45, 3, at5Var4);
        y84 y84Var47 = new y84("SFIXED64_LIST_PACKED", 46, 46, 3, at5Var3);
        y84 y84Var48 = new y84("SINT32_LIST_PACKED", 47, 47, 3, at5Var4);
        y84 y84Var49 = new y84("SINT64_LIST_PACKED", 48, 48, 3, at5Var3);
        c = y84Var49;
        e = new y84[]{y84Var, y84Var2, y84Var3, y84Var4, y84Var5, y84Var6, y84Var7, y84Var8, y84Var9, y84Var10, y84Var11, y84Var12, y84Var13, y84Var14, y84Var15, y84Var16, y84Var17, y84Var18, y84Var19, y84Var20, y84Var21, y84Var22, y84Var23, y84Var24, y84Var25, y84Var26, y84Var27, y84Var28, y84Var29, y84Var30, y84Var31, y84Var32, y84Var33, y84Var34, y84Var35, y84Var36, y84Var37, y84Var38, y84Var39, y84Var40, y84Var41, y84Var42, y84Var43, y84Var44, y84Var45, y84Var46, y84Var47, y84Var48, y84Var49, new y84("GROUP_LIST", 49, 49, 2, at5Var7), new y84("MAP", 50, 50, 4, at5.VOID)};
        y84[] values = values();
        d = new y84[values.length];
        for (y84 y84Var50 : values) {
            d[y84Var50.a] = y84Var50;
        }
    }

    public y84(String str, int i, int i2, int i3, at5 at5Var) {
        this.a = i2;
        int F = ug8.F(i3);
        if (F != 1) {
            if (F == 3) {
                Class cls = at5Var.a;
            }
        } else {
            Class cls2 = at5Var.a;
        }
        if (i3 == 1) {
            at5Var.ordinal();
        }
    }

    public static y84 valueOf(String str) {
        return (y84) Enum.valueOf(y84.class, str);
    }

    public static y84[] values() {
        return (y84[]) e.clone();
    }
}
