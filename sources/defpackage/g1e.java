package defpackage;
public final class g1e {
    public static final g1e b;
    public static final g1e c;
    public static final g1e[] d;
    public static final g1e[] e;
    public final byte a;
    g1e EF0;

    static {
        c6e c6eVar = c6e.DOUBLE;
        g1e g1eVar = new g1e("DOUBLE", 0, 0, 1, c6eVar);
        c6e c6eVar2 = c6e.FLOAT;
        g1e g1eVar2 = new g1e("FLOAT", 1, 1, 1, c6eVar2);
        c6e c6eVar3 = c6e.LONG;
        g1e g1eVar3 = new g1e("INT64", 2, 2, 1, c6eVar3);
        g1e g1eVar4 = new g1e("UINT64", 3, 3, 1, c6eVar3);
        c6e c6eVar4 = c6e.INT;
        g1e g1eVar5 = new g1e("INT32", 4, 4, 1, c6eVar4);
        g1e g1eVar6 = new g1e("FIXED64", 5, 5, 1, c6eVar3);
        g1e g1eVar7 = new g1e("FIXED32", 6, 6, 1, c6eVar4);
        c6e c6eVar5 = c6e.BOOLEAN;
        g1e g1eVar8 = new g1e("BOOL", 7, 7, 1, c6eVar5);
        c6e c6eVar6 = c6e.STRING;
        g1e g1eVar9 = new g1e("STRING", 8, 8, 1, c6eVar6);
        c6e c6eVar7 = c6e.MESSAGE;
        g1e g1eVar10 = new g1e("MESSAGE", 9, 9, 1, c6eVar7);
        c6e c6eVar8 = c6e.BYTE_STRING;
        g1e g1eVar11 = new g1e("BYTES", 10, 10, 1, c6eVar8);
        g1e g1eVar12 = new g1e("UINT32", 11, 11, 1, c6eVar4);
        c6e c6eVar9 = c6e.ENUM;
        g1e g1eVar13 = new g1e("ENUM", 12, 12, 1, c6eVar9);
        g1e g1eVar14 = new g1e("SFIXED32", 13, 13, 1, c6eVar4);
        g1e g1eVar15 = new g1e("SFIXED64", 14, 14, 1, c6eVar3);
        g1e g1eVar16 = new g1e("SINT32", 15, 15, 1, c6eVar4);
        g1e g1eVar17 = new g1e("SINT64", 16, 16, 1, c6eVar3);
        g1e g1eVar18 = new g1e("GROUP", 17, 17, 1, c6eVar7);
        g1e g1eVar19 = new g1e("DOUBLE_LIST", 18, 18, 2, c6eVar);
        g1e g1eVar20 = new g1e("FLOAT_LIST", 19, 19, 2, c6eVar2);
        g1e g1eVar21 = new g1e("INT64_LIST", 20, 20, 2, c6eVar3);
        g1e g1eVar22 = new g1e("UINT64_LIST", 21, 21, 2, c6eVar3);
        g1e g1eVar23 = new g1e("INT32_LIST", 22, 22, 2, c6eVar4);
        g1e g1eVar24 = new g1e("FIXED64_LIST", 23, 23, 2, c6eVar3);
        g1e g1eVar25 = new g1e("FIXED32_LIST", 24, 24, 2, c6eVar4);
        g1e g1eVar26 = new g1e("BOOL_LIST", 25, 25, 2, c6eVar5);
        g1e g1eVar27 = new g1e("STRING_LIST", 26, 26, 2, c6eVar6);
        g1e g1eVar28 = new g1e("MESSAGE_LIST", 27, 27, 2, c6eVar7);
        g1e g1eVar29 = new g1e("BYTES_LIST", 28, 28, 2, c6eVar8);
        g1e g1eVar30 = new g1e("UINT32_LIST", 29, 29, 2, c6eVar4);
        g1e g1eVar31 = new g1e("ENUM_LIST", 30, 30, 2, c6eVar9);
        g1e g1eVar32 = new g1e("SFIXED32_LIST", 31, 31, 2, c6eVar4);
        g1e g1eVar33 = new g1e("SFIXED64_LIST", 32, 32, 2, c6eVar3);
        g1e g1eVar34 = new g1e("SINT32_LIST", 33, 33, 2, c6eVar4);
        g1e g1eVar35 = new g1e("SINT64_LIST", 34, 34, 2, c6eVar3);
        g1e g1eVar36 = new g1e("DOUBLE_LIST_PACKED", 35, 35, 3, c6eVar);
        b = g1eVar36;
        g1e g1eVar37 = new g1e("FLOAT_LIST_PACKED", 36, 36, 3, c6eVar2);
        g1e g1eVar38 = new g1e("INT64_LIST_PACKED", 37, 37, 3, c6eVar3);
        g1e g1eVar39 = new g1e("UINT64_LIST_PACKED", 38, 38, 3, c6eVar3);
        g1e g1eVar40 = new g1e("INT32_LIST_PACKED", 39, 39, 3, c6eVar4);
        g1e g1eVar41 = new g1e("FIXED64_LIST_PACKED", 40, 40, 3, c6eVar3);
        g1e g1eVar42 = new g1e("FIXED32_LIST_PACKED", 41, 41, 3, c6eVar4);
        g1e g1eVar43 = new g1e("BOOL_LIST_PACKED", 42, 42, 3, c6eVar5);
        g1e g1eVar44 = new g1e("UINT32_LIST_PACKED", 43, 43, 3, c6eVar4);
        g1e g1eVar45 = new g1e("ENUM_LIST_PACKED", 44, 44, 3, c6eVar9);
        g1e g1eVar46 = new g1e("SFIXED32_LIST_PACKED", 45, 45, 3, c6eVar4);
        g1e g1eVar47 = new g1e("SFIXED64_LIST_PACKED", 46, 46, 3, c6eVar3);
        g1e g1eVar48 = new g1e("SINT32_LIST_PACKED", 47, 47, 3, c6eVar4);
        g1e g1eVar49 = new g1e("SINT64_LIST_PACKED", 48, 48, 3, c6eVar3);
        c = g1eVar49;
        e = new g1e[]{g1eVar, g1eVar2, g1eVar3, g1eVar4, g1eVar5, g1eVar6, g1eVar7, g1eVar8, g1eVar9, g1eVar10, g1eVar11, g1eVar12, g1eVar13, g1eVar14, g1eVar15, g1eVar16, g1eVar17, g1eVar18, g1eVar19, g1eVar20, g1eVar21, g1eVar22, g1eVar23, g1eVar24, g1eVar25, g1eVar26, g1eVar27, g1eVar28, g1eVar29, g1eVar30, g1eVar31, g1eVar32, g1eVar33, g1eVar34, g1eVar35, g1eVar36, g1eVar37, g1eVar38, g1eVar39, g1eVar40, g1eVar41, g1eVar42, g1eVar43, g1eVar44, g1eVar45, g1eVar46, g1eVar47, g1eVar48, g1eVar49, new g1e("GROUP_LIST", 49, 49, 2, c6eVar7), new g1e("MAP", 50, 50, 4, c6e.VOID)};
        g1e[] values = values();
        d = new g1e[values.length];
        for (g1e g1eVar50 : values) {
            d[g1eVar50.a] = g1eVar50;
        }
    }

    public g1e(String str, int i, int i2, int i3, c6e c6eVar) {
        this.a = i2;
        int i4 = i3 - 1;
        if (i4 != 1) {
            if (i4 == 3) {
                Class cls = c6eVar.a;
            }
        } else {
            Class cls2 = c6eVar.a;
        }
        if (i3 == 1) {
            c6e c6eVar2 = c6e.VOID;
            c6eVar.ordinal();
        }
    }

    public static g1e[] values() {
        return (g1e[]) e.clone();
    }
}
