package defpackage;
public final class vc9 {
    public static final vc9 a;
    public static final vc9 b;
    public static final vc9 c;
    public static final vc9 d;
    public static final vc9 e;
    public static final vc9 f;
    public static final vc9[] h;
    vc9 EF0;

    static {
        Enum r0 = new Enum("OTHER", 0);
        Enum r1 = new Enum("ORIENTATION", 1);
        ?? r3 = new Enum("BYTE_SEGMENTS", 2);
        a = r3;
        ?? r5 = new Enum("ERROR_CORRECTION_LEVEL", 3);
        b = r5;
        ?? r7 = new Enum("ERRORS_CORRECTED", 4);
        c = r7;
        Enum r9 = new Enum("ERASURES_CORRECTED", 5);
        Enum r11 = new Enum("ISSUE_NUMBER", 6);
        Enum r13 = new Enum("SUGGESTED_PRICE", 7);
        Enum r15 = new Enum("POSSIBLE_COUNTRY", 8);
        Enum r2 = new Enum("UPC_EAN_EXTENSION", 9);
        Enum r4 = new Enum("PDF417_EXTRA_METADATA", 10);
        ?? r6 = new Enum("STRUCTURED_APPEND_SEQUENCE", 11);
        d = r6;
        ?? r8 = new Enum("STRUCTURED_APPEND_PARITY", 12);
        e = r8;
        ?? r10 = new Enum("SYMBOLOGY_IDENTIFIER", 13);
        f = r10;
        h = new vc9[]{r0, r1, r3, r5, r7, r9, r11, r13, r15, r2, r4, r6, r8, r10};
    }

    public static vc9 valueOf(String str) {
        return (vc9) Enum.valueOf(vc9.class, str);
    }

    public static vc9[] values() {
        return (vc9[]) h.clone();
    }
}
