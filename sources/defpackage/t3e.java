package defpackage;
public final class t3e {
    public static final t3e b;
    public static final t3e c;
    public static final t3e[] d;
    public static final t3e[] e;
    public final byte a;
    t3e EF0;

    static {
        p8e p8eVar = p8e.DOUBLE;
        t3e t3eVar = new t3e("DOUBLE", 0, 0, 1, p8eVar);
        p8e p8eVar2 = p8e.FLOAT;
        t3e t3eVar2 = new t3e("FLOAT", 1, 1, 1, p8eVar2);
        p8e p8eVar3 = p8e.LONG;
        t3e t3eVar3 = new t3e("INT64", 2, 2, 1, p8eVar3);
        t3e t3eVar4 = new t3e("UINT64", 3, 3, 1, p8eVar3);
        p8e p8eVar4 = p8e.INT;
        t3e t3eVar5 = new t3e("INT32", 4, 4, 1, p8eVar4);
        t3e t3eVar6 = new t3e("FIXED64", 5, 5, 1, p8eVar3);
        t3e t3eVar7 = new t3e("FIXED32", 6, 6, 1, p8eVar4);
        p8e p8eVar5 = p8e.BOOLEAN;
        t3e t3eVar8 = new t3e("BOOL", 7, 7, 1, p8eVar5);
        p8e p8eVar6 = p8e.STRING;
        t3e t3eVar9 = new t3e("STRING", 8, 8, 1, p8eVar6);
        p8e p8eVar7 = p8e.MESSAGE;
        t3e t3eVar10 = new t3e("MESSAGE", 9, 9, 1, p8eVar7);
        p8e p8eVar8 = p8e.BYTE_STRING;
        t3e t3eVar11 = new t3e("BYTES", 10, 10, 1, p8eVar8);
        t3e t3eVar12 = new t3e("UINT32", 11, 11, 1, p8eVar4);
        p8e p8eVar9 = p8e.ENUM;
        t3e t3eVar13 = new t3e("ENUM", 12, 12, 1, p8eVar9);
        t3e t3eVar14 = new t3e("SFIXED32", 13, 13, 1, p8eVar4);
        t3e t3eVar15 = new t3e("SFIXED64", 14, 14, 1, p8eVar3);
        t3e t3eVar16 = new t3e("SINT32", 15, 15, 1, p8eVar4);
        t3e t3eVar17 = new t3e("SINT64", 16, 16, 1, p8eVar3);
        t3e t3eVar18 = new t3e("GROUP", 17, 17, 1, p8eVar7);
        t3e t3eVar19 = new t3e("DOUBLE_LIST", 18, 18, 2, p8eVar);
        t3e t3eVar20 = new t3e("FLOAT_LIST", 19, 19, 2, p8eVar2);
        t3e t3eVar21 = new t3e("INT64_LIST", 20, 20, 2, p8eVar3);
        t3e t3eVar22 = new t3e("UINT64_LIST", 21, 21, 2, p8eVar3);
        t3e t3eVar23 = new t3e("INT32_LIST", 22, 22, 2, p8eVar4);
        t3e t3eVar24 = new t3e("FIXED64_LIST", 23, 23, 2, p8eVar3);
        t3e t3eVar25 = new t3e("FIXED32_LIST", 24, 24, 2, p8eVar4);
        t3e t3eVar26 = new t3e("BOOL_LIST", 25, 25, 2, p8eVar5);
        t3e t3eVar27 = new t3e("STRING_LIST", 26, 26, 2, p8eVar6);
        t3e t3eVar28 = new t3e("MESSAGE_LIST", 27, 27, 2, p8eVar7);
        t3e t3eVar29 = new t3e("BYTES_LIST", 28, 28, 2, p8eVar8);
        t3e t3eVar30 = new t3e("UINT32_LIST", 29, 29, 2, p8eVar4);
        t3e t3eVar31 = new t3e("ENUM_LIST", 30, 30, 2, p8eVar9);
        t3e t3eVar32 = new t3e("SFIXED32_LIST", 31, 31, 2, p8eVar4);
        t3e t3eVar33 = new t3e("SFIXED64_LIST", 32, 32, 2, p8eVar3);
        t3e t3eVar34 = new t3e("SINT32_LIST", 33, 33, 2, p8eVar4);
        t3e t3eVar35 = new t3e("SINT64_LIST", 34, 34, 2, p8eVar3);
        t3e t3eVar36 = new t3e("DOUBLE_LIST_PACKED", 35, 35, 3, p8eVar);
        b = t3eVar36;
        t3e t3eVar37 = new t3e("FLOAT_LIST_PACKED", 36, 36, 3, p8eVar2);
        t3e t3eVar38 = new t3e("INT64_LIST_PACKED", 37, 37, 3, p8eVar3);
        t3e t3eVar39 = new t3e("UINT64_LIST_PACKED", 38, 38, 3, p8eVar3);
        t3e t3eVar40 = new t3e("INT32_LIST_PACKED", 39, 39, 3, p8eVar4);
        t3e t3eVar41 = new t3e("FIXED64_LIST_PACKED", 40, 40, 3, p8eVar3);
        t3e t3eVar42 = new t3e("FIXED32_LIST_PACKED", 41, 41, 3, p8eVar4);
        t3e t3eVar43 = new t3e("BOOL_LIST_PACKED", 42, 42, 3, p8eVar5);
        t3e t3eVar44 = new t3e("UINT32_LIST_PACKED", 43, 43, 3, p8eVar4);
        t3e t3eVar45 = new t3e("ENUM_LIST_PACKED", 44, 44, 3, p8eVar9);
        t3e t3eVar46 = new t3e("SFIXED32_LIST_PACKED", 45, 45, 3, p8eVar4);
        t3e t3eVar47 = new t3e("SFIXED64_LIST_PACKED", 46, 46, 3, p8eVar3);
        t3e t3eVar48 = new t3e("SINT32_LIST_PACKED", 47, 47, 3, p8eVar4);
        t3e t3eVar49 = new t3e("SINT64_LIST_PACKED", 48, 48, 3, p8eVar3);
        c = t3eVar49;
        e = new t3e[]{t3eVar, t3eVar2, t3eVar3, t3eVar4, t3eVar5, t3eVar6, t3eVar7, t3eVar8, t3eVar9, t3eVar10, t3eVar11, t3eVar12, t3eVar13, t3eVar14, t3eVar15, t3eVar16, t3eVar17, t3eVar18, t3eVar19, t3eVar20, t3eVar21, t3eVar22, t3eVar23, t3eVar24, t3eVar25, t3eVar26, t3eVar27, t3eVar28, t3eVar29, t3eVar30, t3eVar31, t3eVar32, t3eVar33, t3eVar34, t3eVar35, t3eVar36, t3eVar37, t3eVar38, t3eVar39, t3eVar40, t3eVar41, t3eVar42, t3eVar43, t3eVar44, t3eVar45, t3eVar46, t3eVar47, t3eVar48, t3eVar49, new t3e("GROUP_LIST", 49, 49, 2, p8eVar7), new t3e("MAP", 50, 50, 4, p8e.VOID)};
        t3e[] values = values();
        d = new t3e[values.length];
        for (t3e t3eVar50 : values) {
            d[t3eVar50.a] = t3eVar50;
        }
    }

    public t3e(String str, int i, int i2, int i3, p8e p8eVar) {
        this.a = i2;
        int i4 = i3 - 1;
        if (i4 != 1) {
            if (i4 == 3) {
                Class cls = p8eVar.a;
            }
        } else {
            Class cls2 = p8eVar.a;
        }
        if (i3 == 1) {
            p8e p8eVar2 = p8e.VOID;
            p8eVar.ordinal();
        }
    }

    public static t3e[] values() {
        return (t3e[]) e.clone();
    }
}
