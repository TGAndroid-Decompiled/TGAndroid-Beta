package defpackage;
public final class pqe {
    public static final pqe b;
    public static final pqe c;
    public static final pqe[] d;
    public static final pqe[] e;
    public final byte a;
    pqe EF0;

    static {
        gue gueVar = gue.DOUBLE;
        pqe pqeVar = new pqe("DOUBLE", 0, 0, 1, gueVar);
        gue gueVar2 = gue.FLOAT;
        pqe pqeVar2 = new pqe("FLOAT", 1, 1, 1, gueVar2);
        gue gueVar3 = gue.LONG;
        pqe pqeVar3 = new pqe("INT64", 2, 2, 1, gueVar3);
        pqe pqeVar4 = new pqe("UINT64", 3, 3, 1, gueVar3);
        gue gueVar4 = gue.INT;
        pqe pqeVar5 = new pqe("INT32", 4, 4, 1, gueVar4);
        pqe pqeVar6 = new pqe("FIXED64", 5, 5, 1, gueVar3);
        pqe pqeVar7 = new pqe("FIXED32", 6, 6, 1, gueVar4);
        gue gueVar5 = gue.BOOLEAN;
        pqe pqeVar8 = new pqe("BOOL", 7, 7, 1, gueVar5);
        gue gueVar6 = gue.STRING;
        pqe pqeVar9 = new pqe("STRING", 8, 8, 1, gueVar6);
        gue gueVar7 = gue.MESSAGE;
        pqe pqeVar10 = new pqe("MESSAGE", 9, 9, 1, gueVar7);
        gue gueVar8 = gue.BYTE_STRING;
        pqe pqeVar11 = new pqe("BYTES", 10, 10, 1, gueVar8);
        pqe pqeVar12 = new pqe("UINT32", 11, 11, 1, gueVar4);
        gue gueVar9 = gue.ENUM;
        pqe pqeVar13 = new pqe("ENUM", 12, 12, 1, gueVar9);
        pqe pqeVar14 = new pqe("SFIXED32", 13, 13, 1, gueVar4);
        pqe pqeVar15 = new pqe("SFIXED64", 14, 14, 1, gueVar3);
        pqe pqeVar16 = new pqe("SINT32", 15, 15, 1, gueVar4);
        pqe pqeVar17 = new pqe("SINT64", 16, 16, 1, gueVar3);
        pqe pqeVar18 = new pqe("GROUP", 17, 17, 1, gueVar7);
        pqe pqeVar19 = new pqe("DOUBLE_LIST", 18, 18, 2, gueVar);
        pqe pqeVar20 = new pqe("FLOAT_LIST", 19, 19, 2, gueVar2);
        pqe pqeVar21 = new pqe("INT64_LIST", 20, 20, 2, gueVar3);
        pqe pqeVar22 = new pqe("UINT64_LIST", 21, 21, 2, gueVar3);
        pqe pqeVar23 = new pqe("INT32_LIST", 22, 22, 2, gueVar4);
        pqe pqeVar24 = new pqe("FIXED64_LIST", 23, 23, 2, gueVar3);
        pqe pqeVar25 = new pqe("FIXED32_LIST", 24, 24, 2, gueVar4);
        pqe pqeVar26 = new pqe("BOOL_LIST", 25, 25, 2, gueVar5);
        pqe pqeVar27 = new pqe("STRING_LIST", 26, 26, 2, gueVar6);
        pqe pqeVar28 = new pqe("MESSAGE_LIST", 27, 27, 2, gueVar7);
        pqe pqeVar29 = new pqe("BYTES_LIST", 28, 28, 2, gueVar8);
        pqe pqeVar30 = new pqe("UINT32_LIST", 29, 29, 2, gueVar4);
        pqe pqeVar31 = new pqe("ENUM_LIST", 30, 30, 2, gueVar9);
        pqe pqeVar32 = new pqe("SFIXED32_LIST", 31, 31, 2, gueVar4);
        pqe pqeVar33 = new pqe("SFIXED64_LIST", 32, 32, 2, gueVar3);
        pqe pqeVar34 = new pqe("SINT32_LIST", 33, 33, 2, gueVar4);
        pqe pqeVar35 = new pqe("SINT64_LIST", 34, 34, 2, gueVar3);
        pqe pqeVar36 = new pqe("DOUBLE_LIST_PACKED", 35, 35, 3, gueVar);
        b = pqeVar36;
        pqe pqeVar37 = new pqe("FLOAT_LIST_PACKED", 36, 36, 3, gueVar2);
        pqe pqeVar38 = new pqe("INT64_LIST_PACKED", 37, 37, 3, gueVar3);
        pqe pqeVar39 = new pqe("UINT64_LIST_PACKED", 38, 38, 3, gueVar3);
        pqe pqeVar40 = new pqe("INT32_LIST_PACKED", 39, 39, 3, gueVar4);
        pqe pqeVar41 = new pqe("FIXED64_LIST_PACKED", 40, 40, 3, gueVar3);
        pqe pqeVar42 = new pqe("FIXED32_LIST_PACKED", 41, 41, 3, gueVar4);
        pqe pqeVar43 = new pqe("BOOL_LIST_PACKED", 42, 42, 3, gueVar5);
        pqe pqeVar44 = new pqe("UINT32_LIST_PACKED", 43, 43, 3, gueVar4);
        pqe pqeVar45 = new pqe("ENUM_LIST_PACKED", 44, 44, 3, gueVar9);
        pqe pqeVar46 = new pqe("SFIXED32_LIST_PACKED", 45, 45, 3, gueVar4);
        pqe pqeVar47 = new pqe("SFIXED64_LIST_PACKED", 46, 46, 3, gueVar3);
        pqe pqeVar48 = new pqe("SINT32_LIST_PACKED", 47, 47, 3, gueVar4);
        pqe pqeVar49 = new pqe("SINT64_LIST_PACKED", 48, 48, 3, gueVar3);
        c = pqeVar49;
        e = new pqe[]{pqeVar, pqeVar2, pqeVar3, pqeVar4, pqeVar5, pqeVar6, pqeVar7, pqeVar8, pqeVar9, pqeVar10, pqeVar11, pqeVar12, pqeVar13, pqeVar14, pqeVar15, pqeVar16, pqeVar17, pqeVar18, pqeVar19, pqeVar20, pqeVar21, pqeVar22, pqeVar23, pqeVar24, pqeVar25, pqeVar26, pqeVar27, pqeVar28, pqeVar29, pqeVar30, pqeVar31, pqeVar32, pqeVar33, pqeVar34, pqeVar35, pqeVar36, pqeVar37, pqeVar38, pqeVar39, pqeVar40, pqeVar41, pqeVar42, pqeVar43, pqeVar44, pqeVar45, pqeVar46, pqeVar47, pqeVar48, pqeVar49, new pqe("GROUP_LIST", 49, 49, 2, gueVar7), new pqe("MAP", 50, 50, 4, gue.VOID)};
        pqe[] values = values();
        d = new pqe[values.length];
        for (pqe pqeVar50 : values) {
            d[pqeVar50.a] = pqeVar50;
        }
    }

    public pqe(String str, int i, int i2, int i3, gue gueVar) {
        this.a = i2;
        int i4 = zqe.a[ik8.F(i3)];
        if (i4 != 1) {
            if (i4 == 2) {
                Class cls = gueVar.a;
            }
        } else {
            Class cls2 = gueVar.a;
        }
        if (i3 == 1) {
            int i5 = zqe.b[gueVar.ordinal()];
        }
    }

    public static pqe[] values() {
        return (pqe[]) e.clone();
    }
}
