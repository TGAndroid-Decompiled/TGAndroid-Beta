package defpackage;
public final class zf0 {
    public static final zf0 a;
    public static final zf0 b;
    public static final zf0 c;
    public static final zf0 d;
    public static final zf0[] e;

    static {
        ?? r0 = new Enum("AZTEC", 0);
        a = r0;
        Enum r1 = new Enum("CODABAR", 1);
        Enum r3 = new Enum("CODE_39", 2);
        Enum r5 = new Enum("CODE_93", 3);
        ?? r7 = new Enum("CODE_128", 4);
        b = r7;
        Enum r9 = new Enum("DATA_MATRIX", 5);
        Enum r11 = new Enum("EAN_8", 6);
        Enum r13 = new Enum("EAN_13", 7);
        Enum r15 = new Enum("ITF", 8);
        Enum r2 = new Enum("MAXICODE", 9);
        ?? r4 = new Enum("PDF_417", 10);
        c = r4;
        ?? r6 = new Enum("QR_CODE", 11);
        d = r6;
        e = new zf0[]{r0, r1, r3, r5, r7, r9, r11, r13, r15, r2, r4, r6, new Enum("RSS_14", 12), new Enum("RSS_EXPANDED", 13), new Enum("UPC_A", 14), new Enum("UPC_E", 15), new Enum("UPC_EAN_EXTENSION", 16)};
    }

    public static zf0 valueOf(String str) {
        return (zf0) Enum.valueOf(zf0.class, str);
    }

    public static zf0[] values() {
        return (zf0[]) e.clone();
    }
}
