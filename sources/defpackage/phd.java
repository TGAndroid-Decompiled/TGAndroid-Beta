package defpackage;
public final class phd {
    public static final phd b;
    public static final phd c;
    public static final phd d;
    public static final phd e;
    public static final phd f;
    public static final phd h;
    public static final phd n;
    public static final phd r;
    public static final phd s;
    public static final phd[] w;
    public static final phd[] x;
    public final byte a;
    phd EF0;

    static {
        gld gldVar = gld.DOUBLE;
        phd phdVar = new phd("DOUBLE", 0, 0, 1, gldVar);
        gld gldVar2 = gld.FLOAT;
        phd phdVar2 = new phd("FLOAT", 1, 1, 1, gldVar2);
        gld gldVar3 = gld.LONG;
        phd phdVar3 = new phd("INT64", 2, 2, 1, gldVar3);
        phd phdVar4 = new phd("UINT64", 3, 3, 1, gldVar3);
        gld gldVar4 = gld.INT;
        phd phdVar5 = new phd("INT32", 4, 4, 1, gldVar4);
        phd phdVar6 = new phd("FIXED64", 5, 5, 1, gldVar3);
        phd phdVar7 = new phd("FIXED32", 6, 6, 1, gldVar4);
        gld gldVar5 = gld.BOOLEAN;
        phd phdVar8 = new phd("BOOL", 7, 7, 1, gldVar5);
        gld gldVar6 = gld.STRING;
        phd phdVar9 = new phd("STRING", 8, 8, 1, gldVar6);
        gld gldVar7 = gld.MESSAGE;
        phd phdVar10 = new phd("MESSAGE", 9, 9, 1, gldVar7);
        b = phdVar10;
        gld gldVar8 = gld.BYTE_STRING;
        phd phdVar11 = new phd("BYTES", 10, 10, 1, gldVar8);
        phd phdVar12 = new phd("UINT32", 11, 11, 1, gldVar4);
        gld gldVar9 = gld.ENUM;
        phd phdVar13 = new phd("ENUM", 12, 12, 1, gldVar9);
        c = phdVar13;
        phd phdVar14 = new phd("SFIXED32", 13, 13, 1, gldVar4);
        phd phdVar15 = new phd("SFIXED64", 14, 14, 1, gldVar3);
        phd phdVar16 = new phd("SINT32", 15, 15, 1, gldVar4);
        phd phdVar17 = new phd("SINT64", 16, 16, 1, gldVar3);
        phd phdVar18 = new phd("GROUP", 17, 17, 1, gldVar7);
        d = phdVar18;
        phd phdVar19 = new phd("DOUBLE_LIST", 18, 18, 2, gldVar);
        e = phdVar19;
        phd phdVar20 = new phd("FLOAT_LIST", 19, 19, 2, gldVar2);
        phd phdVar21 = new phd("INT64_LIST", 20, 20, 2, gldVar3);
        phd phdVar22 = new phd("UINT64_LIST", 21, 21, 2, gldVar3);
        phd phdVar23 = new phd("INT32_LIST", 22, 22, 2, gldVar4);
        phd phdVar24 = new phd("FIXED64_LIST", 23, 23, 2, gldVar3);
        phd phdVar25 = new phd("FIXED32_LIST", 24, 24, 2, gldVar4);
        phd phdVar26 = new phd("BOOL_LIST", 25, 25, 2, gldVar5);
        phd phdVar27 = new phd("STRING_LIST", 26, 26, 2, gldVar6);
        phd phdVar28 = new phd("MESSAGE_LIST", 27, 27, 2, gldVar7);
        f = phdVar28;
        phd phdVar29 = new phd("BYTES_LIST", 28, 28, 2, gldVar8);
        phd phdVar30 = new phd("UINT32_LIST", 29, 29, 2, gldVar4);
        phd phdVar31 = new phd("ENUM_LIST", 30, 30, 2, gldVar9);
        h = phdVar31;
        phd phdVar32 = new phd("SFIXED32_LIST", 31, 31, 2, gldVar4);
        phd phdVar33 = new phd("SFIXED64_LIST", 32, 32, 2, gldVar3);
        phd phdVar34 = new phd("SINT32_LIST", 33, 33, 2, gldVar4);
        phd phdVar35 = new phd("SINT64_LIST", 34, 34, 2, gldVar3);
        phd phdVar36 = new phd("DOUBLE_LIST_PACKED", 35, 35, 3, gldVar);
        phd phdVar37 = new phd("FLOAT_LIST_PACKED", 36, 36, 3, gldVar2);
        phd phdVar38 = new phd("INT64_LIST_PACKED", 37, 37, 3, gldVar3);
        phd phdVar39 = new phd("UINT64_LIST_PACKED", 38, 38, 3, gldVar3);
        phd phdVar40 = new phd("INT32_LIST_PACKED", 39, 39, 3, gldVar4);
        phd phdVar41 = new phd("FIXED64_LIST_PACKED", 40, 40, 3, gldVar3);
        phd phdVar42 = new phd("FIXED32_LIST_PACKED", 41, 41, 3, gldVar4);
        phd phdVar43 = new phd("BOOL_LIST_PACKED", 42, 42, 3, gldVar5);
        phd phdVar44 = new phd("UINT32_LIST_PACKED", 43, 43, 3, gldVar4);
        phd phdVar45 = new phd("ENUM_LIST_PACKED", 44, 44, 3, gldVar9);
        n = phdVar45;
        phd phdVar46 = new phd("SFIXED32_LIST_PACKED", 45, 45, 3, gldVar4);
        phd phdVar47 = new phd("SFIXED64_LIST_PACKED", 46, 46, 3, gldVar3);
        phd phdVar48 = new phd("SINT32_LIST_PACKED", 47, 47, 3, gldVar4);
        phd phdVar49 = new phd("SINT64_LIST_PACKED", 48, 48, 3, gldVar3);
        phd phdVar50 = new phd("GROUP_LIST", 49, 49, 2, gldVar7);
        r = phdVar50;
        phd phdVar51 = new phd("MAP", 50, 50, 4, gld.VOID);
        s = phdVar51;
        x = new phd[]{phdVar, phdVar2, phdVar3, phdVar4, phdVar5, phdVar6, phdVar7, phdVar8, phdVar9, phdVar10, phdVar11, phdVar12, phdVar13, phdVar14, phdVar15, phdVar16, phdVar17, phdVar18, phdVar19, phdVar20, phdVar21, phdVar22, phdVar23, phdVar24, phdVar25, phdVar26, phdVar27, phdVar28, phdVar29, phdVar30, phdVar31, phdVar32, phdVar33, phdVar34, phdVar35, phdVar36, phdVar37, phdVar38, phdVar39, phdVar40, phdVar41, phdVar42, phdVar43, phdVar44, phdVar45, phdVar46, phdVar47, phdVar48, phdVar49, phdVar50, phdVar51};
        phd[] values = values();
        w = new phd[values.length];
        for (phd phdVar52 : values) {
            w[phdVar52.a] = phdVar52;
        }
    }

    public phd(String str, int i, int i2, int i3, gld gldVar) {
        this.a = i2;
        int i4 = whd.a[ug8.F(i3)];
        if (i4 == 1 || i4 == 2) {
            Class cls = gldVar.a;
        }
        if (i3 == 1) {
            int i5 = whd.b[gldVar.ordinal()];
        }
    }

    public static phd[] values() {
        return (phd[]) x.clone();
    }
}
