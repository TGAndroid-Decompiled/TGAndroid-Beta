package defpackage;
public final class gmd {
    public static final gmd b;
    public static final gmd c;
    public static final gmd d;
    public static final gmd e;
    public static final gmd f;
    public static final gmd h;
    public static final gmd n;
    public static final gmd r;
    public static final gmd s;
    public static final gmd[] w;
    public static final gmd[] x;
    public final byte a;
    gmd EF0;

    static {
        xpd xpdVar = xpd.DOUBLE;
        gmd gmdVar = new gmd("DOUBLE", 0, 0, 1, xpdVar);
        xpd xpdVar2 = xpd.FLOAT;
        gmd gmdVar2 = new gmd("FLOAT", 1, 1, 1, xpdVar2);
        xpd xpdVar3 = xpd.LONG;
        gmd gmdVar3 = new gmd("INT64", 2, 2, 1, xpdVar3);
        gmd gmdVar4 = new gmd("UINT64", 3, 3, 1, xpdVar3);
        xpd xpdVar4 = xpd.INT;
        gmd gmdVar5 = new gmd("INT32", 4, 4, 1, xpdVar4);
        gmd gmdVar6 = new gmd("FIXED64", 5, 5, 1, xpdVar3);
        gmd gmdVar7 = new gmd("FIXED32", 6, 6, 1, xpdVar4);
        xpd xpdVar5 = xpd.BOOLEAN;
        gmd gmdVar8 = new gmd("BOOL", 7, 7, 1, xpdVar5);
        xpd xpdVar6 = xpd.STRING;
        gmd gmdVar9 = new gmd("STRING", 8, 8, 1, xpdVar6);
        xpd xpdVar7 = xpd.MESSAGE;
        gmd gmdVar10 = new gmd("MESSAGE", 9, 9, 1, xpdVar7);
        b = gmdVar10;
        xpd xpdVar8 = xpd.BYTE_STRING;
        gmd gmdVar11 = new gmd("BYTES", 10, 10, 1, xpdVar8);
        gmd gmdVar12 = new gmd("UINT32", 11, 11, 1, xpdVar4);
        xpd xpdVar9 = xpd.ENUM;
        gmd gmdVar13 = new gmd("ENUM", 12, 12, 1, xpdVar9);
        c = gmdVar13;
        gmd gmdVar14 = new gmd("SFIXED32", 13, 13, 1, xpdVar4);
        gmd gmdVar15 = new gmd("SFIXED64", 14, 14, 1, xpdVar3);
        gmd gmdVar16 = new gmd("SINT32", 15, 15, 1, xpdVar4);
        gmd gmdVar17 = new gmd("SINT64", 16, 16, 1, xpdVar3);
        gmd gmdVar18 = new gmd("GROUP", 17, 17, 1, xpdVar7);
        d = gmdVar18;
        gmd gmdVar19 = new gmd("DOUBLE_LIST", 18, 18, 2, xpdVar);
        e = gmdVar19;
        gmd gmdVar20 = new gmd("FLOAT_LIST", 19, 19, 2, xpdVar2);
        gmd gmdVar21 = new gmd("INT64_LIST", 20, 20, 2, xpdVar3);
        gmd gmdVar22 = new gmd("UINT64_LIST", 21, 21, 2, xpdVar3);
        gmd gmdVar23 = new gmd("INT32_LIST", 22, 22, 2, xpdVar4);
        gmd gmdVar24 = new gmd("FIXED64_LIST", 23, 23, 2, xpdVar3);
        gmd gmdVar25 = new gmd("FIXED32_LIST", 24, 24, 2, xpdVar4);
        gmd gmdVar26 = new gmd("BOOL_LIST", 25, 25, 2, xpdVar5);
        gmd gmdVar27 = new gmd("STRING_LIST", 26, 26, 2, xpdVar6);
        gmd gmdVar28 = new gmd("MESSAGE_LIST", 27, 27, 2, xpdVar7);
        f = gmdVar28;
        gmd gmdVar29 = new gmd("BYTES_LIST", 28, 28, 2, xpdVar8);
        gmd gmdVar30 = new gmd("UINT32_LIST", 29, 29, 2, xpdVar4);
        gmd gmdVar31 = new gmd("ENUM_LIST", 30, 30, 2, xpdVar9);
        h = gmdVar31;
        gmd gmdVar32 = new gmd("SFIXED32_LIST", 31, 31, 2, xpdVar4);
        gmd gmdVar33 = new gmd("SFIXED64_LIST", 32, 32, 2, xpdVar3);
        gmd gmdVar34 = new gmd("SINT32_LIST", 33, 33, 2, xpdVar4);
        gmd gmdVar35 = new gmd("SINT64_LIST", 34, 34, 2, xpdVar3);
        gmd gmdVar36 = new gmd("DOUBLE_LIST_PACKED", 35, 35, 3, xpdVar);
        gmd gmdVar37 = new gmd("FLOAT_LIST_PACKED", 36, 36, 3, xpdVar2);
        gmd gmdVar38 = new gmd("INT64_LIST_PACKED", 37, 37, 3, xpdVar3);
        gmd gmdVar39 = new gmd("UINT64_LIST_PACKED", 38, 38, 3, xpdVar3);
        gmd gmdVar40 = new gmd("INT32_LIST_PACKED", 39, 39, 3, xpdVar4);
        gmd gmdVar41 = new gmd("FIXED64_LIST_PACKED", 40, 40, 3, xpdVar3);
        gmd gmdVar42 = new gmd("FIXED32_LIST_PACKED", 41, 41, 3, xpdVar4);
        gmd gmdVar43 = new gmd("BOOL_LIST_PACKED", 42, 42, 3, xpdVar5);
        gmd gmdVar44 = new gmd("UINT32_LIST_PACKED", 43, 43, 3, xpdVar4);
        gmd gmdVar45 = new gmd("ENUM_LIST_PACKED", 44, 44, 3, xpdVar9);
        n = gmdVar45;
        gmd gmdVar46 = new gmd("SFIXED32_LIST_PACKED", 45, 45, 3, xpdVar4);
        gmd gmdVar47 = new gmd("SFIXED64_LIST_PACKED", 46, 46, 3, xpdVar3);
        gmd gmdVar48 = new gmd("SINT32_LIST_PACKED", 47, 47, 3, xpdVar4);
        gmd gmdVar49 = new gmd("SINT64_LIST_PACKED", 48, 48, 3, xpdVar3);
        gmd gmdVar50 = new gmd("GROUP_LIST", 49, 49, 2, xpdVar7);
        r = gmdVar50;
        gmd gmdVar51 = new gmd("MAP", 50, 50, 4, xpd.VOID);
        s = gmdVar51;
        x = new gmd[]{gmdVar, gmdVar2, gmdVar3, gmdVar4, gmdVar5, gmdVar6, gmdVar7, gmdVar8, gmdVar9, gmdVar10, gmdVar11, gmdVar12, gmdVar13, gmdVar14, gmdVar15, gmdVar16, gmdVar17, gmdVar18, gmdVar19, gmdVar20, gmdVar21, gmdVar22, gmdVar23, gmdVar24, gmdVar25, gmdVar26, gmdVar27, gmdVar28, gmdVar29, gmdVar30, gmdVar31, gmdVar32, gmdVar33, gmdVar34, gmdVar35, gmdVar36, gmdVar37, gmdVar38, gmdVar39, gmdVar40, gmdVar41, gmdVar42, gmdVar43, gmdVar44, gmdVar45, gmdVar46, gmdVar47, gmdVar48, gmdVar49, gmdVar50, gmdVar51};
        gmd[] values = values();
        w = new gmd[values.length];
        for (gmd gmdVar52 : values) {
            w[gmdVar52.a] = gmdVar52;
        }
    }

    public gmd(String str, int i, int i2, int i3, xpd xpdVar) {
        this.a = i2;
        int i4 = nmd.a[ik8.F(i3)];
        if (i4 == 1 || i4 == 2) {
            Class cls = xpdVar.a;
        }
        if (i3 == 1) {
            int i5 = nmd.b[xpdVar.ordinal()];
        }
    }

    public static gmd[] values() {
        return (gmd[]) x.clone();
    }
}
