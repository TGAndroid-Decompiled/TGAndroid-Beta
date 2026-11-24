package defpackage;
public final class aoe {
    public static final aoe b;
    public static final aoe c;
    public static final aoe[] d;
    public static final aoe[] e;
    public final byte a;
    aoe EF0;

    static {
        sre sreVar = sre.DOUBLE;
        aoe aoeVar = new aoe("DOUBLE", 0, 0, 1, sreVar);
        sre sreVar2 = sre.FLOAT;
        aoe aoeVar2 = new aoe("FLOAT", 1, 1, 1, sreVar2);
        sre sreVar3 = sre.LONG;
        aoe aoeVar3 = new aoe("INT64", 2, 2, 1, sreVar3);
        aoe aoeVar4 = new aoe("UINT64", 3, 3, 1, sreVar3);
        sre sreVar4 = sre.INT;
        aoe aoeVar5 = new aoe("INT32", 4, 4, 1, sreVar4);
        aoe aoeVar6 = new aoe("FIXED64", 5, 5, 1, sreVar3);
        aoe aoeVar7 = new aoe("FIXED32", 6, 6, 1, sreVar4);
        sre sreVar5 = sre.BOOLEAN;
        aoe aoeVar8 = new aoe("BOOL", 7, 7, 1, sreVar5);
        sre sreVar6 = sre.STRING;
        aoe aoeVar9 = new aoe("STRING", 8, 8, 1, sreVar6);
        sre sreVar7 = sre.MESSAGE;
        aoe aoeVar10 = new aoe("MESSAGE", 9, 9, 1, sreVar7);
        sre sreVar8 = sre.BYTE_STRING;
        aoe aoeVar11 = new aoe("BYTES", 10, 10, 1, sreVar8);
        aoe aoeVar12 = new aoe("UINT32", 11, 11, 1, sreVar4);
        sre sreVar9 = sre.ENUM;
        aoe aoeVar13 = new aoe("ENUM", 12, 12, 1, sreVar9);
        aoe aoeVar14 = new aoe("SFIXED32", 13, 13, 1, sreVar4);
        aoe aoeVar15 = new aoe("SFIXED64", 14, 14, 1, sreVar3);
        aoe aoeVar16 = new aoe("SINT32", 15, 15, 1, sreVar4);
        aoe aoeVar17 = new aoe("SINT64", 16, 16, 1, sreVar3);
        aoe aoeVar18 = new aoe("GROUP", 17, 17, 1, sreVar7);
        aoe aoeVar19 = new aoe("DOUBLE_LIST", 18, 18, 2, sreVar);
        aoe aoeVar20 = new aoe("FLOAT_LIST", 19, 19, 2, sreVar2);
        aoe aoeVar21 = new aoe("INT64_LIST", 20, 20, 2, sreVar3);
        aoe aoeVar22 = new aoe("UINT64_LIST", 21, 21, 2, sreVar3);
        aoe aoeVar23 = new aoe("INT32_LIST", 22, 22, 2, sreVar4);
        aoe aoeVar24 = new aoe("FIXED64_LIST", 23, 23, 2, sreVar3);
        aoe aoeVar25 = new aoe("FIXED32_LIST", 24, 24, 2, sreVar4);
        aoe aoeVar26 = new aoe("BOOL_LIST", 25, 25, 2, sreVar5);
        aoe aoeVar27 = new aoe("STRING_LIST", 26, 26, 2, sreVar6);
        aoe aoeVar28 = new aoe("MESSAGE_LIST", 27, 27, 2, sreVar7);
        aoe aoeVar29 = new aoe("BYTES_LIST", 28, 28, 2, sreVar8);
        aoe aoeVar30 = new aoe("UINT32_LIST", 29, 29, 2, sreVar4);
        aoe aoeVar31 = new aoe("ENUM_LIST", 30, 30, 2, sreVar9);
        aoe aoeVar32 = new aoe("SFIXED32_LIST", 31, 31, 2, sreVar4);
        aoe aoeVar33 = new aoe("SFIXED64_LIST", 32, 32, 2, sreVar3);
        aoe aoeVar34 = new aoe("SINT32_LIST", 33, 33, 2, sreVar4);
        aoe aoeVar35 = new aoe("SINT64_LIST", 34, 34, 2, sreVar3);
        aoe aoeVar36 = new aoe("DOUBLE_LIST_PACKED", 35, 35, 3, sreVar);
        b = aoeVar36;
        aoe aoeVar37 = new aoe("FLOAT_LIST_PACKED", 36, 36, 3, sreVar2);
        aoe aoeVar38 = new aoe("INT64_LIST_PACKED", 37, 37, 3, sreVar3);
        aoe aoeVar39 = new aoe("UINT64_LIST_PACKED", 38, 38, 3, sreVar3);
        aoe aoeVar40 = new aoe("INT32_LIST_PACKED", 39, 39, 3, sreVar4);
        aoe aoeVar41 = new aoe("FIXED64_LIST_PACKED", 40, 40, 3, sreVar3);
        aoe aoeVar42 = new aoe("FIXED32_LIST_PACKED", 41, 41, 3, sreVar4);
        aoe aoeVar43 = new aoe("BOOL_LIST_PACKED", 42, 42, 3, sreVar5);
        aoe aoeVar44 = new aoe("UINT32_LIST_PACKED", 43, 43, 3, sreVar4);
        aoe aoeVar45 = new aoe("ENUM_LIST_PACKED", 44, 44, 3, sreVar9);
        aoe aoeVar46 = new aoe("SFIXED32_LIST_PACKED", 45, 45, 3, sreVar4);
        aoe aoeVar47 = new aoe("SFIXED64_LIST_PACKED", 46, 46, 3, sreVar3);
        aoe aoeVar48 = new aoe("SINT32_LIST_PACKED", 47, 47, 3, sreVar4);
        aoe aoeVar49 = new aoe("SINT64_LIST_PACKED", 48, 48, 3, sreVar3);
        c = aoeVar49;
        e = new aoe[]{aoeVar, aoeVar2, aoeVar3, aoeVar4, aoeVar5, aoeVar6, aoeVar7, aoeVar8, aoeVar9, aoeVar10, aoeVar11, aoeVar12, aoeVar13, aoeVar14, aoeVar15, aoeVar16, aoeVar17, aoeVar18, aoeVar19, aoeVar20, aoeVar21, aoeVar22, aoeVar23, aoeVar24, aoeVar25, aoeVar26, aoeVar27, aoeVar28, aoeVar29, aoeVar30, aoeVar31, aoeVar32, aoeVar33, aoeVar34, aoeVar35, aoeVar36, aoeVar37, aoeVar38, aoeVar39, aoeVar40, aoeVar41, aoeVar42, aoeVar43, aoeVar44, aoeVar45, aoeVar46, aoeVar47, aoeVar48, aoeVar49, new aoe("GROUP_LIST", 49, 49, 2, sreVar7), new aoe("MAP", 50, 50, 4, sre.VOID)};
        aoe[] values = values();
        d = new aoe[values.length];
        for (aoe aoeVar50 : values) {
            d[aoeVar50.a] = aoeVar50;
        }
    }

    public aoe(String str, int i, int i2, int i3, sre sreVar) {
        this.a = i2;
        int i4 = loe.a[wi8.F(i3)];
        if (i4 != 1) {
            if (i4 == 2) {
                Class cls = sreVar.a;
            }
        } else {
            Class cls2 = sreVar.a;
        }
        if (i3 == 1) {
            int i5 = loe.b[sreVar.ordinal()];
        }
    }

    public static aoe[] values() {
        return (aoe[]) e.clone();
    }
}
