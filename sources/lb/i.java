package lb;

public final class i {

    public static final i f15524a;

    public static final i f15525b;

    public static final i f15526c;
    public static final i d;

    public static final i f15527e;

    public static final i f15528f;
    public static final i[] h;

    i EF0;

    static {
        i iVar = new i("OTHER", 0);
        i iVar2 = new i("ORIENTATION", 1);
        i iVar3 = new i("BYTE_SEGMENTS", 2);
        f15524a = iVar3;
        i iVar4 = new i("ERROR_CORRECTION_LEVEL", 3);
        f15525b = iVar4;
        i iVar5 = new i("ERRORS_CORRECTED", 4);
        f15526c = iVar5;
        i iVar6 = new i("ERASURES_CORRECTED", 5);
        i iVar7 = new i("ISSUE_NUMBER", 6);
        i iVar8 = new i("SUGGESTED_PRICE", 7);
        i iVar9 = new i("POSSIBLE_COUNTRY", 8);
        i iVar10 = new i("UPC_EAN_EXTENSION", 9);
        i iVar11 = new i("PDF417_EXTRA_METADATA", 10);
        i iVar12 = new i("STRUCTURED_APPEND_SEQUENCE", 11);
        d = iVar12;
        i iVar13 = new i("STRUCTURED_APPEND_PARITY", 12);
        f15527e = iVar13;
        i iVar14 = new i("SYMBOLOGY_IDENTIFIER", 13);
        f15528f = iVar14;
        h = new i[]{iVar, iVar2, iVar3, iVar4, iVar5, iVar6, iVar7, iVar8, iVar9, iVar10, iVar11, iVar12, iVar13, iVar14};
    }

    public static i valueOf(String str) {
        return (i) Enum.valueOf(i.class, str);
    }

    public static i[] values() {
        return (i[]) h.clone();
    }
}
