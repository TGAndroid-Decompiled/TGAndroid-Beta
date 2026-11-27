package defpackage;
public final class hjf {
    public static final hjf b;
    public static final hjf c;
    public static final hjf[] d;
    public static final hjf[] e;
    public final byte a;
    hjf EF0;

    static {
        ckf ckfVar = ckf.DOUBLE;
        hjf hjfVar = new hjf("DOUBLE", 0, 0, 1, ckfVar);
        ckf ckfVar2 = ckf.FLOAT;
        hjf hjfVar2 = new hjf("FLOAT", 1, 1, 1, ckfVar2);
        ckf ckfVar3 = ckf.LONG;
        hjf hjfVar3 = new hjf("INT64", 2, 2, 1, ckfVar3);
        hjf hjfVar4 = new hjf("UINT64", 3, 3, 1, ckfVar3);
        ckf ckfVar4 = ckf.INT;
        hjf hjfVar5 = new hjf("INT32", 4, 4, 1, ckfVar4);
        hjf hjfVar6 = new hjf("FIXED64", 5, 5, 1, ckfVar3);
        hjf hjfVar7 = new hjf("FIXED32", 6, 6, 1, ckfVar4);
        ckf ckfVar5 = ckf.BOOLEAN;
        hjf hjfVar8 = new hjf("BOOL", 7, 7, 1, ckfVar5);
        ckf ckfVar6 = ckf.STRING;
        hjf hjfVar9 = new hjf("STRING", 8, 8, 1, ckfVar6);
        ckf ckfVar7 = ckf.MESSAGE;
        hjf hjfVar10 = new hjf("MESSAGE", 9, 9, 1, ckfVar7);
        ckf ckfVar8 = ckf.BYTE_STRING;
        hjf hjfVar11 = new hjf("BYTES", 10, 10, 1, ckfVar8);
        hjf hjfVar12 = new hjf("UINT32", 11, 11, 1, ckfVar4);
        ckf ckfVar9 = ckf.ENUM;
        hjf hjfVar13 = new hjf("ENUM", 12, 12, 1, ckfVar9);
        hjf hjfVar14 = new hjf("SFIXED32", 13, 13, 1, ckfVar4);
        hjf hjfVar15 = new hjf("SFIXED64", 14, 14, 1, ckfVar3);
        hjf hjfVar16 = new hjf("SINT32", 15, 15, 1, ckfVar4);
        hjf hjfVar17 = new hjf("SINT64", 16, 16, 1, ckfVar3);
        hjf hjfVar18 = new hjf("GROUP", 17, 17, 1, ckfVar7);
        hjf hjfVar19 = new hjf("DOUBLE_LIST", 18, 18, 2, ckfVar);
        hjf hjfVar20 = new hjf("FLOAT_LIST", 19, 19, 2, ckfVar2);
        hjf hjfVar21 = new hjf("INT64_LIST", 20, 20, 2, ckfVar3);
        hjf hjfVar22 = new hjf("UINT64_LIST", 21, 21, 2, ckfVar3);
        hjf hjfVar23 = new hjf("INT32_LIST", 22, 22, 2, ckfVar4);
        hjf hjfVar24 = new hjf("FIXED64_LIST", 23, 23, 2, ckfVar3);
        hjf hjfVar25 = new hjf("FIXED32_LIST", 24, 24, 2, ckfVar4);
        hjf hjfVar26 = new hjf("BOOL_LIST", 25, 25, 2, ckfVar5);
        hjf hjfVar27 = new hjf("STRING_LIST", 26, 26, 2, ckfVar6);
        hjf hjfVar28 = new hjf("MESSAGE_LIST", 27, 27, 2, ckfVar7);
        hjf hjfVar29 = new hjf("BYTES_LIST", 28, 28, 2, ckfVar8);
        hjf hjfVar30 = new hjf("UINT32_LIST", 29, 29, 2, ckfVar4);
        hjf hjfVar31 = new hjf("ENUM_LIST", 30, 30, 2, ckfVar9);
        hjf hjfVar32 = new hjf("SFIXED32_LIST", 31, 31, 2, ckfVar4);
        hjf hjfVar33 = new hjf("SFIXED64_LIST", 32, 32, 2, ckfVar3);
        hjf hjfVar34 = new hjf("SINT32_LIST", 33, 33, 2, ckfVar4);
        hjf hjfVar35 = new hjf("SINT64_LIST", 34, 34, 2, ckfVar3);
        hjf hjfVar36 = new hjf("DOUBLE_LIST_PACKED", 35, 35, 3, ckfVar);
        b = hjfVar36;
        hjf hjfVar37 = new hjf("FLOAT_LIST_PACKED", 36, 36, 3, ckfVar2);
        hjf hjfVar38 = new hjf("INT64_LIST_PACKED", 37, 37, 3, ckfVar3);
        hjf hjfVar39 = new hjf("UINT64_LIST_PACKED", 38, 38, 3, ckfVar3);
        hjf hjfVar40 = new hjf("INT32_LIST_PACKED", 39, 39, 3, ckfVar4);
        hjf hjfVar41 = new hjf("FIXED64_LIST_PACKED", 40, 40, 3, ckfVar3);
        hjf hjfVar42 = new hjf("FIXED32_LIST_PACKED", 41, 41, 3, ckfVar4);
        hjf hjfVar43 = new hjf("BOOL_LIST_PACKED", 42, 42, 3, ckfVar5);
        hjf hjfVar44 = new hjf("UINT32_LIST_PACKED", 43, 43, 3, ckfVar4);
        hjf hjfVar45 = new hjf("ENUM_LIST_PACKED", 44, 44, 3, ckfVar9);
        hjf hjfVar46 = new hjf("SFIXED32_LIST_PACKED", 45, 45, 3, ckfVar4);
        hjf hjfVar47 = new hjf("SFIXED64_LIST_PACKED", 46, 46, 3, ckfVar3);
        hjf hjfVar48 = new hjf("SINT32_LIST_PACKED", 47, 47, 3, ckfVar4);
        hjf hjfVar49 = new hjf("SINT64_LIST_PACKED", 48, 48, 3, ckfVar3);
        c = hjfVar49;
        e = new hjf[]{hjfVar, hjfVar2, hjfVar3, hjfVar4, hjfVar5, hjfVar6, hjfVar7, hjfVar8, hjfVar9, hjfVar10, hjfVar11, hjfVar12, hjfVar13, hjfVar14, hjfVar15, hjfVar16, hjfVar17, hjfVar18, hjfVar19, hjfVar20, hjfVar21, hjfVar22, hjfVar23, hjfVar24, hjfVar25, hjfVar26, hjfVar27, hjfVar28, hjfVar29, hjfVar30, hjfVar31, hjfVar32, hjfVar33, hjfVar34, hjfVar35, hjfVar36, hjfVar37, hjfVar38, hjfVar39, hjfVar40, hjfVar41, hjfVar42, hjfVar43, hjfVar44, hjfVar45, hjfVar46, hjfVar47, hjfVar48, hjfVar49, new hjf("GROUP_LIST", 49, 49, 2, ckfVar7), new hjf("MAP", 50, 50, 4, ckf.VOID)};
        hjf[] values = values();
        d = new hjf[values.length];
        for (hjf hjfVar50 : values) {
            d[hjfVar50.a] = hjfVar50;
        }
    }

    public hjf(String str, int i, int i2, int i3, ckf ckfVar) {
        this.a = i2;
        int i4 = i3 - 1;
        if (i4 != 1) {
            if (i4 == 3) {
                Class cls = ckfVar.a;
            }
        } else {
            Class cls2 = ckfVar.a;
        }
        if (i3 == 1) {
            ckf ckfVar2 = ckf.VOID;
            ckfVar.ordinal();
        }
    }

    public static hjf[] values() {
        return (hjf[]) e.clone();
    }
}
