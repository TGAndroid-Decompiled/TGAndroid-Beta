package defpackage;
public final class dzd {
    public static final dzd b;
    public static final dzd c;
    public static final dzd[] d;
    public static final dzd[] e;
    public final byte a;
    dzd EF0;

    static {
        z3e z3eVar = z3e.DOUBLE;
        dzd dzdVar = new dzd("DOUBLE", 0, 0, 1, z3eVar);
        z3e z3eVar2 = z3e.FLOAT;
        dzd dzdVar2 = new dzd("FLOAT", 1, 1, 1, z3eVar2);
        z3e z3eVar3 = z3e.LONG;
        dzd dzdVar3 = new dzd("INT64", 2, 2, 1, z3eVar3);
        dzd dzdVar4 = new dzd("UINT64", 3, 3, 1, z3eVar3);
        z3e z3eVar4 = z3e.INT;
        dzd dzdVar5 = new dzd("INT32", 4, 4, 1, z3eVar4);
        dzd dzdVar6 = new dzd("FIXED64", 5, 5, 1, z3eVar3);
        dzd dzdVar7 = new dzd("FIXED32", 6, 6, 1, z3eVar4);
        z3e z3eVar5 = z3e.BOOLEAN;
        dzd dzdVar8 = new dzd("BOOL", 7, 7, 1, z3eVar5);
        z3e z3eVar6 = z3e.STRING;
        dzd dzdVar9 = new dzd("STRING", 8, 8, 1, z3eVar6);
        z3e z3eVar7 = z3e.MESSAGE;
        dzd dzdVar10 = new dzd("MESSAGE", 9, 9, 1, z3eVar7);
        z3e z3eVar8 = z3e.BYTE_STRING;
        dzd dzdVar11 = new dzd("BYTES", 10, 10, 1, z3eVar8);
        dzd dzdVar12 = new dzd("UINT32", 11, 11, 1, z3eVar4);
        z3e z3eVar9 = z3e.ENUM;
        dzd dzdVar13 = new dzd("ENUM", 12, 12, 1, z3eVar9);
        dzd dzdVar14 = new dzd("SFIXED32", 13, 13, 1, z3eVar4);
        dzd dzdVar15 = new dzd("SFIXED64", 14, 14, 1, z3eVar3);
        dzd dzdVar16 = new dzd("SINT32", 15, 15, 1, z3eVar4);
        dzd dzdVar17 = new dzd("SINT64", 16, 16, 1, z3eVar3);
        dzd dzdVar18 = new dzd("GROUP", 17, 17, 1, z3eVar7);
        dzd dzdVar19 = new dzd("DOUBLE_LIST", 18, 18, 2, z3eVar);
        dzd dzdVar20 = new dzd("FLOAT_LIST", 19, 19, 2, z3eVar2);
        dzd dzdVar21 = new dzd("INT64_LIST", 20, 20, 2, z3eVar3);
        dzd dzdVar22 = new dzd("UINT64_LIST", 21, 21, 2, z3eVar3);
        dzd dzdVar23 = new dzd("INT32_LIST", 22, 22, 2, z3eVar4);
        dzd dzdVar24 = new dzd("FIXED64_LIST", 23, 23, 2, z3eVar3);
        dzd dzdVar25 = new dzd("FIXED32_LIST", 24, 24, 2, z3eVar4);
        dzd dzdVar26 = new dzd("BOOL_LIST", 25, 25, 2, z3eVar5);
        dzd dzdVar27 = new dzd("STRING_LIST", 26, 26, 2, z3eVar6);
        dzd dzdVar28 = new dzd("MESSAGE_LIST", 27, 27, 2, z3eVar7);
        dzd dzdVar29 = new dzd("BYTES_LIST", 28, 28, 2, z3eVar8);
        dzd dzdVar30 = new dzd("UINT32_LIST", 29, 29, 2, z3eVar4);
        dzd dzdVar31 = new dzd("ENUM_LIST", 30, 30, 2, z3eVar9);
        dzd dzdVar32 = new dzd("SFIXED32_LIST", 31, 31, 2, z3eVar4);
        dzd dzdVar33 = new dzd("SFIXED64_LIST", 32, 32, 2, z3eVar3);
        dzd dzdVar34 = new dzd("SINT32_LIST", 33, 33, 2, z3eVar4);
        dzd dzdVar35 = new dzd("SINT64_LIST", 34, 34, 2, z3eVar3);
        dzd dzdVar36 = new dzd("DOUBLE_LIST_PACKED", 35, 35, 3, z3eVar);
        b = dzdVar36;
        dzd dzdVar37 = new dzd("FLOAT_LIST_PACKED", 36, 36, 3, z3eVar2);
        dzd dzdVar38 = new dzd("INT64_LIST_PACKED", 37, 37, 3, z3eVar3);
        dzd dzdVar39 = new dzd("UINT64_LIST_PACKED", 38, 38, 3, z3eVar3);
        dzd dzdVar40 = new dzd("INT32_LIST_PACKED", 39, 39, 3, z3eVar4);
        dzd dzdVar41 = new dzd("FIXED64_LIST_PACKED", 40, 40, 3, z3eVar3);
        dzd dzdVar42 = new dzd("FIXED32_LIST_PACKED", 41, 41, 3, z3eVar4);
        dzd dzdVar43 = new dzd("BOOL_LIST_PACKED", 42, 42, 3, z3eVar5);
        dzd dzdVar44 = new dzd("UINT32_LIST_PACKED", 43, 43, 3, z3eVar4);
        dzd dzdVar45 = new dzd("ENUM_LIST_PACKED", 44, 44, 3, z3eVar9);
        dzd dzdVar46 = new dzd("SFIXED32_LIST_PACKED", 45, 45, 3, z3eVar4);
        dzd dzdVar47 = new dzd("SFIXED64_LIST_PACKED", 46, 46, 3, z3eVar3);
        dzd dzdVar48 = new dzd("SINT32_LIST_PACKED", 47, 47, 3, z3eVar4);
        dzd dzdVar49 = new dzd("SINT64_LIST_PACKED", 48, 48, 3, z3eVar3);
        c = dzdVar49;
        e = new dzd[]{dzdVar, dzdVar2, dzdVar3, dzdVar4, dzdVar5, dzdVar6, dzdVar7, dzdVar8, dzdVar9, dzdVar10, dzdVar11, dzdVar12, dzdVar13, dzdVar14, dzdVar15, dzdVar16, dzdVar17, dzdVar18, dzdVar19, dzdVar20, dzdVar21, dzdVar22, dzdVar23, dzdVar24, dzdVar25, dzdVar26, dzdVar27, dzdVar28, dzdVar29, dzdVar30, dzdVar31, dzdVar32, dzdVar33, dzdVar34, dzdVar35, dzdVar36, dzdVar37, dzdVar38, dzdVar39, dzdVar40, dzdVar41, dzdVar42, dzdVar43, dzdVar44, dzdVar45, dzdVar46, dzdVar47, dzdVar48, dzdVar49, new dzd("GROUP_LIST", 49, 49, 2, z3eVar7), new dzd("MAP", 50, 50, 4, z3e.VOID)};
        dzd[] values = values();
        d = new dzd[values.length];
        for (dzd dzdVar50 : values) {
            d[dzdVar50.a] = dzdVar50;
        }
    }

    public dzd(String str, int i, int i2, int i3, z3e z3eVar) {
        this.a = i2;
        int i4 = i3 - 1;
        if (i4 != 1) {
            if (i4 == 3) {
                Class cls = z3eVar.a;
            }
        } else {
            Class cls2 = z3eVar.a;
        }
        if (i3 == 1) {
            z3e z3eVar2 = z3e.VOID;
            z3eVar.ordinal();
        }
    }

    public static dzd[] values() {
        return (dzd[]) e.clone();
    }
}
