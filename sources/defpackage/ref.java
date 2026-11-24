package defpackage;
public final class ref {
    public static final ref b;
    public static final ref c;
    public static final ref[] d;
    public static final ref[] e;
    public final byte a;
    ref EF0;

    static {
        mff mffVar = mff.DOUBLE;
        ref refVar = new ref("DOUBLE", 0, 0, 1, mffVar);
        mff mffVar2 = mff.FLOAT;
        ref refVar2 = new ref("FLOAT", 1, 1, 1, mffVar2);
        mff mffVar3 = mff.LONG;
        ref refVar3 = new ref("INT64", 2, 2, 1, mffVar3);
        ref refVar4 = new ref("UINT64", 3, 3, 1, mffVar3);
        mff mffVar4 = mff.INT;
        ref refVar5 = new ref("INT32", 4, 4, 1, mffVar4);
        ref refVar6 = new ref("FIXED64", 5, 5, 1, mffVar3);
        ref refVar7 = new ref("FIXED32", 6, 6, 1, mffVar4);
        mff mffVar5 = mff.BOOLEAN;
        ref refVar8 = new ref("BOOL", 7, 7, 1, mffVar5);
        mff mffVar6 = mff.STRING;
        ref refVar9 = new ref("STRING", 8, 8, 1, mffVar6);
        mff mffVar7 = mff.MESSAGE;
        ref refVar10 = new ref("MESSAGE", 9, 9, 1, mffVar7);
        mff mffVar8 = mff.BYTE_STRING;
        ref refVar11 = new ref("BYTES", 10, 10, 1, mffVar8);
        ref refVar12 = new ref("UINT32", 11, 11, 1, mffVar4);
        mff mffVar9 = mff.ENUM;
        ref refVar13 = new ref("ENUM", 12, 12, 1, mffVar9);
        ref refVar14 = new ref("SFIXED32", 13, 13, 1, mffVar4);
        ref refVar15 = new ref("SFIXED64", 14, 14, 1, mffVar3);
        ref refVar16 = new ref("SINT32", 15, 15, 1, mffVar4);
        ref refVar17 = new ref("SINT64", 16, 16, 1, mffVar3);
        ref refVar18 = new ref("GROUP", 17, 17, 1, mffVar7);
        ref refVar19 = new ref("DOUBLE_LIST", 18, 18, 2, mffVar);
        ref refVar20 = new ref("FLOAT_LIST", 19, 19, 2, mffVar2);
        ref refVar21 = new ref("INT64_LIST", 20, 20, 2, mffVar3);
        ref refVar22 = new ref("UINT64_LIST", 21, 21, 2, mffVar3);
        ref refVar23 = new ref("INT32_LIST", 22, 22, 2, mffVar4);
        ref refVar24 = new ref("FIXED64_LIST", 23, 23, 2, mffVar3);
        ref refVar25 = new ref("FIXED32_LIST", 24, 24, 2, mffVar4);
        ref refVar26 = new ref("BOOL_LIST", 25, 25, 2, mffVar5);
        ref refVar27 = new ref("STRING_LIST", 26, 26, 2, mffVar6);
        ref refVar28 = new ref("MESSAGE_LIST", 27, 27, 2, mffVar7);
        ref refVar29 = new ref("BYTES_LIST", 28, 28, 2, mffVar8);
        ref refVar30 = new ref("UINT32_LIST", 29, 29, 2, mffVar4);
        ref refVar31 = new ref("ENUM_LIST", 30, 30, 2, mffVar9);
        ref refVar32 = new ref("SFIXED32_LIST", 31, 31, 2, mffVar4);
        ref refVar33 = new ref("SFIXED64_LIST", 32, 32, 2, mffVar3);
        ref refVar34 = new ref("SINT32_LIST", 33, 33, 2, mffVar4);
        ref refVar35 = new ref("SINT64_LIST", 34, 34, 2, mffVar3);
        ref refVar36 = new ref("DOUBLE_LIST_PACKED", 35, 35, 3, mffVar);
        b = refVar36;
        ref refVar37 = new ref("FLOAT_LIST_PACKED", 36, 36, 3, mffVar2);
        ref refVar38 = new ref("INT64_LIST_PACKED", 37, 37, 3, mffVar3);
        ref refVar39 = new ref("UINT64_LIST_PACKED", 38, 38, 3, mffVar3);
        ref refVar40 = new ref("INT32_LIST_PACKED", 39, 39, 3, mffVar4);
        ref refVar41 = new ref("FIXED64_LIST_PACKED", 40, 40, 3, mffVar3);
        ref refVar42 = new ref("FIXED32_LIST_PACKED", 41, 41, 3, mffVar4);
        ref refVar43 = new ref("BOOL_LIST_PACKED", 42, 42, 3, mffVar5);
        ref refVar44 = new ref("UINT32_LIST_PACKED", 43, 43, 3, mffVar4);
        ref refVar45 = new ref("ENUM_LIST_PACKED", 44, 44, 3, mffVar9);
        ref refVar46 = new ref("SFIXED32_LIST_PACKED", 45, 45, 3, mffVar4);
        ref refVar47 = new ref("SFIXED64_LIST_PACKED", 46, 46, 3, mffVar3);
        ref refVar48 = new ref("SINT32_LIST_PACKED", 47, 47, 3, mffVar4);
        ref refVar49 = new ref("SINT64_LIST_PACKED", 48, 48, 3, mffVar3);
        c = refVar49;
        e = new ref[]{refVar, refVar2, refVar3, refVar4, refVar5, refVar6, refVar7, refVar8, refVar9, refVar10, refVar11, refVar12, refVar13, refVar14, refVar15, refVar16, refVar17, refVar18, refVar19, refVar20, refVar21, refVar22, refVar23, refVar24, refVar25, refVar26, refVar27, refVar28, refVar29, refVar30, refVar31, refVar32, refVar33, refVar34, refVar35, refVar36, refVar37, refVar38, refVar39, refVar40, refVar41, refVar42, refVar43, refVar44, refVar45, refVar46, refVar47, refVar48, refVar49, new ref("GROUP_LIST", 49, 49, 2, mffVar7), new ref("MAP", 50, 50, 4, mff.VOID)};
        ref[] values = values();
        d = new ref[values.length];
        for (ref refVar50 : values) {
            d[refVar50.a] = refVar50;
        }
    }

    public ref(String str, int i, int i2, int i3, mff mffVar) {
        this.a = i2;
        int i4 = i3 - 1;
        if (i4 != 1) {
            if (i4 == 3) {
                Class cls = mffVar.a;
            }
        } else {
            Class cls2 = mffVar.a;
        }
        if (i3 == 1) {
            mff mffVar2 = mff.VOID;
            mffVar.ordinal();
        }
    }

    public static ref[] values() {
        return (ref[]) e.clone();
    }
}
