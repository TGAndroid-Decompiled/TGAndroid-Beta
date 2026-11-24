package defpackage;
public final class sgf {
    public static final sgf b;
    public static final sgf c;
    public static final sgf[] d;
    public static final sgf[] e;
    public final byte a;
    sgf EF0;

    static {
        nhf nhfVar = nhf.DOUBLE;
        sgf sgfVar = new sgf("DOUBLE", 0, 0, 1, nhfVar);
        nhf nhfVar2 = nhf.FLOAT;
        sgf sgfVar2 = new sgf("FLOAT", 1, 1, 1, nhfVar2);
        nhf nhfVar3 = nhf.LONG;
        sgf sgfVar3 = new sgf("INT64", 2, 2, 1, nhfVar3);
        sgf sgfVar4 = new sgf("UINT64", 3, 3, 1, nhfVar3);
        nhf nhfVar4 = nhf.INT;
        sgf sgfVar5 = new sgf("INT32", 4, 4, 1, nhfVar4);
        sgf sgfVar6 = new sgf("FIXED64", 5, 5, 1, nhfVar3);
        sgf sgfVar7 = new sgf("FIXED32", 6, 6, 1, nhfVar4);
        nhf nhfVar5 = nhf.BOOLEAN;
        sgf sgfVar8 = new sgf("BOOL", 7, 7, 1, nhfVar5);
        nhf nhfVar6 = nhf.STRING;
        sgf sgfVar9 = new sgf("STRING", 8, 8, 1, nhfVar6);
        nhf nhfVar7 = nhf.MESSAGE;
        sgf sgfVar10 = new sgf("MESSAGE", 9, 9, 1, nhfVar7);
        nhf nhfVar8 = nhf.BYTE_STRING;
        sgf sgfVar11 = new sgf("BYTES", 10, 10, 1, nhfVar8);
        sgf sgfVar12 = new sgf("UINT32", 11, 11, 1, nhfVar4);
        nhf nhfVar9 = nhf.ENUM;
        sgf sgfVar13 = new sgf("ENUM", 12, 12, 1, nhfVar9);
        sgf sgfVar14 = new sgf("SFIXED32", 13, 13, 1, nhfVar4);
        sgf sgfVar15 = new sgf("SFIXED64", 14, 14, 1, nhfVar3);
        sgf sgfVar16 = new sgf("SINT32", 15, 15, 1, nhfVar4);
        sgf sgfVar17 = new sgf("SINT64", 16, 16, 1, nhfVar3);
        sgf sgfVar18 = new sgf("GROUP", 17, 17, 1, nhfVar7);
        sgf sgfVar19 = new sgf("DOUBLE_LIST", 18, 18, 2, nhfVar);
        sgf sgfVar20 = new sgf("FLOAT_LIST", 19, 19, 2, nhfVar2);
        sgf sgfVar21 = new sgf("INT64_LIST", 20, 20, 2, nhfVar3);
        sgf sgfVar22 = new sgf("UINT64_LIST", 21, 21, 2, nhfVar3);
        sgf sgfVar23 = new sgf("INT32_LIST", 22, 22, 2, nhfVar4);
        sgf sgfVar24 = new sgf("FIXED64_LIST", 23, 23, 2, nhfVar3);
        sgf sgfVar25 = new sgf("FIXED32_LIST", 24, 24, 2, nhfVar4);
        sgf sgfVar26 = new sgf("BOOL_LIST", 25, 25, 2, nhfVar5);
        sgf sgfVar27 = new sgf("STRING_LIST", 26, 26, 2, nhfVar6);
        sgf sgfVar28 = new sgf("MESSAGE_LIST", 27, 27, 2, nhfVar7);
        sgf sgfVar29 = new sgf("BYTES_LIST", 28, 28, 2, nhfVar8);
        sgf sgfVar30 = new sgf("UINT32_LIST", 29, 29, 2, nhfVar4);
        sgf sgfVar31 = new sgf("ENUM_LIST", 30, 30, 2, nhfVar9);
        sgf sgfVar32 = new sgf("SFIXED32_LIST", 31, 31, 2, nhfVar4);
        sgf sgfVar33 = new sgf("SFIXED64_LIST", 32, 32, 2, nhfVar3);
        sgf sgfVar34 = new sgf("SINT32_LIST", 33, 33, 2, nhfVar4);
        sgf sgfVar35 = new sgf("SINT64_LIST", 34, 34, 2, nhfVar3);
        sgf sgfVar36 = new sgf("DOUBLE_LIST_PACKED", 35, 35, 3, nhfVar);
        b = sgfVar36;
        sgf sgfVar37 = new sgf("FLOAT_LIST_PACKED", 36, 36, 3, nhfVar2);
        sgf sgfVar38 = new sgf("INT64_LIST_PACKED", 37, 37, 3, nhfVar3);
        sgf sgfVar39 = new sgf("UINT64_LIST_PACKED", 38, 38, 3, nhfVar3);
        sgf sgfVar40 = new sgf("INT32_LIST_PACKED", 39, 39, 3, nhfVar4);
        sgf sgfVar41 = new sgf("FIXED64_LIST_PACKED", 40, 40, 3, nhfVar3);
        sgf sgfVar42 = new sgf("FIXED32_LIST_PACKED", 41, 41, 3, nhfVar4);
        sgf sgfVar43 = new sgf("BOOL_LIST_PACKED", 42, 42, 3, nhfVar5);
        sgf sgfVar44 = new sgf("UINT32_LIST_PACKED", 43, 43, 3, nhfVar4);
        sgf sgfVar45 = new sgf("ENUM_LIST_PACKED", 44, 44, 3, nhfVar9);
        sgf sgfVar46 = new sgf("SFIXED32_LIST_PACKED", 45, 45, 3, nhfVar4);
        sgf sgfVar47 = new sgf("SFIXED64_LIST_PACKED", 46, 46, 3, nhfVar3);
        sgf sgfVar48 = new sgf("SINT32_LIST_PACKED", 47, 47, 3, nhfVar4);
        sgf sgfVar49 = new sgf("SINT64_LIST_PACKED", 48, 48, 3, nhfVar3);
        c = sgfVar49;
        e = new sgf[]{sgfVar, sgfVar2, sgfVar3, sgfVar4, sgfVar5, sgfVar6, sgfVar7, sgfVar8, sgfVar9, sgfVar10, sgfVar11, sgfVar12, sgfVar13, sgfVar14, sgfVar15, sgfVar16, sgfVar17, sgfVar18, sgfVar19, sgfVar20, sgfVar21, sgfVar22, sgfVar23, sgfVar24, sgfVar25, sgfVar26, sgfVar27, sgfVar28, sgfVar29, sgfVar30, sgfVar31, sgfVar32, sgfVar33, sgfVar34, sgfVar35, sgfVar36, sgfVar37, sgfVar38, sgfVar39, sgfVar40, sgfVar41, sgfVar42, sgfVar43, sgfVar44, sgfVar45, sgfVar46, sgfVar47, sgfVar48, sgfVar49, new sgf("GROUP_LIST", 49, 49, 2, nhfVar7), new sgf("MAP", 50, 50, 4, nhf.VOID)};
        sgf[] values = values();
        d = new sgf[values.length];
        for (sgf sgfVar50 : values) {
            d[sgfVar50.a] = sgfVar50;
        }
    }

    public sgf(String str, int i, int i2, int i3, nhf nhfVar) {
        this.a = i2;
        int i4 = i3 - 1;
        if (i4 != 1) {
            if (i4 == 3) {
                Class cls = nhfVar.a;
            }
        } else {
            Class cls2 = nhfVar.a;
        }
        if (i3 == 1) {
            nhf nhfVar2 = nhf.VOID;
            nhfVar.ordinal();
        }
    }

    public static sgf[] values() {
        return (sgf[]) e.clone();
    }
}
