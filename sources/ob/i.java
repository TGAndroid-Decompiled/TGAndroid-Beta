package ob;
public final class i {
    public static final i f16698a;
    public static final i f16699b;
    public static final i f16700c;
    public static final i d;
    public static final i f16701e;
    public static final i f16702f;
    public static final i[] h;
    i EF0;

    static {
        Enum r02 = new Enum("OTHER", 0);
        Enum r12 = new Enum("ORIENTATION", 1);
        ?? r32 = new Enum("BYTE_SEGMENTS", 2);
        f16698a = r32;
        ?? r52 = new Enum("ERROR_CORRECTION_LEVEL", 3);
        f16699b = r52;
        ?? r72 = new Enum("ERRORS_CORRECTED", 4);
        f16700c = r72;
        Enum r92 = new Enum("ERASURES_CORRECTED", 5);
        Enum r11 = new Enum("ISSUE_NUMBER", 6);
        Enum r13 = new Enum("SUGGESTED_PRICE", 7);
        Enum r15 = new Enum("POSSIBLE_COUNTRY", 8);
        Enum r22 = new Enum("UPC_EAN_EXTENSION", 9);
        Enum r42 = new Enum("PDF417_EXTRA_METADATA", 10);
        ?? r62 = new Enum("STRUCTURED_APPEND_SEQUENCE", 11);
        d = r62;
        ?? r82 = new Enum("STRUCTURED_APPEND_PARITY", 12);
        f16701e = r82;
        ?? r10 = new Enum("SYMBOLOGY_IDENTIFIER", 13);
        f16702f = r10;
        h = new i[]{r02, r12, r32, r52, r72, r92, r11, r13, r15, r22, r42, r62, r82, r10};
    }

    public static i valueOf(String str) {
        return (i) Enum.valueOf(i.class, str);
    }

    public static i[] values() {
        return (i[]) h.clone();
    }
}
