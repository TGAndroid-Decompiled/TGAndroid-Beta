package defpackage;
public final class qjd {
    public static final qjd b;
    public static final qjd c;
    public static final qjd d;
    public static final qjd e;
    public static final qjd f;
    public static final qjd h;
    public static final qjd n;
    public static final qjd r;
    public static final qjd s;
    public static final qjd[] w;
    public static final qjd[] x;
    public final byte a;
    qjd EF0;

    static {
        ind indVar = ind.DOUBLE;
        qjd qjdVar = new qjd("DOUBLE", 0, 0, 1, indVar);
        ind indVar2 = ind.FLOAT;
        qjd qjdVar2 = new qjd("FLOAT", 1, 1, 1, indVar2);
        ind indVar3 = ind.LONG;
        qjd qjdVar3 = new qjd("INT64", 2, 2, 1, indVar3);
        qjd qjdVar4 = new qjd("UINT64", 3, 3, 1, indVar3);
        ind indVar4 = ind.INT;
        qjd qjdVar5 = new qjd("INT32", 4, 4, 1, indVar4);
        qjd qjdVar6 = new qjd("FIXED64", 5, 5, 1, indVar3);
        qjd qjdVar7 = new qjd("FIXED32", 6, 6, 1, indVar4);
        ind indVar5 = ind.BOOLEAN;
        qjd qjdVar8 = new qjd("BOOL", 7, 7, 1, indVar5);
        ind indVar6 = ind.STRING;
        qjd qjdVar9 = new qjd("STRING", 8, 8, 1, indVar6);
        ind indVar7 = ind.MESSAGE;
        qjd qjdVar10 = new qjd("MESSAGE", 9, 9, 1, indVar7);
        b = qjdVar10;
        ind indVar8 = ind.BYTE_STRING;
        qjd qjdVar11 = new qjd("BYTES", 10, 10, 1, indVar8);
        qjd qjdVar12 = new qjd("UINT32", 11, 11, 1, indVar4);
        ind indVar9 = ind.ENUM;
        qjd qjdVar13 = new qjd("ENUM", 12, 12, 1, indVar9);
        c = qjdVar13;
        qjd qjdVar14 = new qjd("SFIXED32", 13, 13, 1, indVar4);
        qjd qjdVar15 = new qjd("SFIXED64", 14, 14, 1, indVar3);
        qjd qjdVar16 = new qjd("SINT32", 15, 15, 1, indVar4);
        qjd qjdVar17 = new qjd("SINT64", 16, 16, 1, indVar3);
        qjd qjdVar18 = new qjd("GROUP", 17, 17, 1, indVar7);
        d = qjdVar18;
        qjd qjdVar19 = new qjd("DOUBLE_LIST", 18, 18, 2, indVar);
        e = qjdVar19;
        qjd qjdVar20 = new qjd("FLOAT_LIST", 19, 19, 2, indVar2);
        qjd qjdVar21 = new qjd("INT64_LIST", 20, 20, 2, indVar3);
        qjd qjdVar22 = new qjd("UINT64_LIST", 21, 21, 2, indVar3);
        qjd qjdVar23 = new qjd("INT32_LIST", 22, 22, 2, indVar4);
        qjd qjdVar24 = new qjd("FIXED64_LIST", 23, 23, 2, indVar3);
        qjd qjdVar25 = new qjd("FIXED32_LIST", 24, 24, 2, indVar4);
        qjd qjdVar26 = new qjd("BOOL_LIST", 25, 25, 2, indVar5);
        qjd qjdVar27 = new qjd("STRING_LIST", 26, 26, 2, indVar6);
        qjd qjdVar28 = new qjd("MESSAGE_LIST", 27, 27, 2, indVar7);
        f = qjdVar28;
        qjd qjdVar29 = new qjd("BYTES_LIST", 28, 28, 2, indVar8);
        qjd qjdVar30 = new qjd("UINT32_LIST", 29, 29, 2, indVar4);
        qjd qjdVar31 = new qjd("ENUM_LIST", 30, 30, 2, indVar9);
        h = qjdVar31;
        qjd qjdVar32 = new qjd("SFIXED32_LIST", 31, 31, 2, indVar4);
        qjd qjdVar33 = new qjd("SFIXED64_LIST", 32, 32, 2, indVar3);
        qjd qjdVar34 = new qjd("SINT32_LIST", 33, 33, 2, indVar4);
        qjd qjdVar35 = new qjd("SINT64_LIST", 34, 34, 2, indVar3);
        qjd qjdVar36 = new qjd("DOUBLE_LIST_PACKED", 35, 35, 3, indVar);
        qjd qjdVar37 = new qjd("FLOAT_LIST_PACKED", 36, 36, 3, indVar2);
        qjd qjdVar38 = new qjd("INT64_LIST_PACKED", 37, 37, 3, indVar3);
        qjd qjdVar39 = new qjd("UINT64_LIST_PACKED", 38, 38, 3, indVar3);
        qjd qjdVar40 = new qjd("INT32_LIST_PACKED", 39, 39, 3, indVar4);
        qjd qjdVar41 = new qjd("FIXED64_LIST_PACKED", 40, 40, 3, indVar3);
        qjd qjdVar42 = new qjd("FIXED32_LIST_PACKED", 41, 41, 3, indVar4);
        qjd qjdVar43 = new qjd("BOOL_LIST_PACKED", 42, 42, 3, indVar5);
        qjd qjdVar44 = new qjd("UINT32_LIST_PACKED", 43, 43, 3, indVar4);
        qjd qjdVar45 = new qjd("ENUM_LIST_PACKED", 44, 44, 3, indVar9);
        n = qjdVar45;
        qjd qjdVar46 = new qjd("SFIXED32_LIST_PACKED", 45, 45, 3, indVar4);
        qjd qjdVar47 = new qjd("SFIXED64_LIST_PACKED", 46, 46, 3, indVar3);
        qjd qjdVar48 = new qjd("SINT32_LIST_PACKED", 47, 47, 3, indVar4);
        qjd qjdVar49 = new qjd("SINT64_LIST_PACKED", 48, 48, 3, indVar3);
        qjd qjdVar50 = new qjd("GROUP_LIST", 49, 49, 2, indVar7);
        r = qjdVar50;
        qjd qjdVar51 = new qjd("MAP", 50, 50, 4, ind.VOID);
        s = qjdVar51;
        x = new qjd[]{qjdVar, qjdVar2, qjdVar3, qjdVar4, qjdVar5, qjdVar6, qjdVar7, qjdVar8, qjdVar9, qjdVar10, qjdVar11, qjdVar12, qjdVar13, qjdVar14, qjdVar15, qjdVar16, qjdVar17, qjdVar18, qjdVar19, qjdVar20, qjdVar21, qjdVar22, qjdVar23, qjdVar24, qjdVar25, qjdVar26, qjdVar27, qjdVar28, qjdVar29, qjdVar30, qjdVar31, qjdVar32, qjdVar33, qjdVar34, qjdVar35, qjdVar36, qjdVar37, qjdVar38, qjdVar39, qjdVar40, qjdVar41, qjdVar42, qjdVar43, qjdVar44, qjdVar45, qjdVar46, qjdVar47, qjdVar48, qjdVar49, qjdVar50, qjdVar51};
        qjd[] values = values();
        w = new qjd[values.length];
        for (qjd qjdVar52 : values) {
            w[qjdVar52.a] = qjdVar52;
        }
    }

    public qjd(String str, int i, int i2, int i3, ind indVar) {
        this.a = i2;
        int i4 = xjd.a[wi8.F(i3)];
        if (i4 == 1 || i4 == 2) {
            Class cls = indVar.a;
        }
        if (i3 == 1) {
            int i5 = xjd.b[indVar.ordinal()];
        }
    }

    public static qjd[] values() {
        return (qjd[]) x.clone();
    }
}
