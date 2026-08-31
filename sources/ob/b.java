package ob;
public final class b {
    public static final b f16681a;
    public static final b f16682b;
    public static final b f16683c;
    public static final b d;
    public static final b f16684e;
    public static final b f16685f;
    public static final b h;
    public static final b[] f16686n;

    static {
        ?? r02 = new Enum("ERROR_CORRECTION", 0);
        f16681a = r02;
        ?? r12 = new Enum("CHARACTER_SET", 1);
        f16682b = r12;
        Enum r32 = new Enum("DATA_MATRIX_SHAPE", 2);
        Enum r52 = new Enum("DATA_MATRIX_COMPACT", 3);
        Enum r72 = new Enum("MIN_SIZE", 4);
        Enum r92 = new Enum("MAX_SIZE", 5);
        ?? r11 = new Enum("MARGIN", 6);
        f16683c = r11;
        Enum r13 = new Enum("PDF417_COMPACT", 7);
        Enum r15 = new Enum("PDF417_COMPACTION", 8);
        Enum r22 = new Enum("PDF417_DIMENSIONS", 9);
        Enum r42 = new Enum("PDF417_AUTO_ECI", 10);
        Enum r62 = new Enum("AZTEC_LAYERS", 11);
        ?? r82 = new Enum("QR_VERSION", 12);
        d = r82;
        ?? r10 = new Enum("QR_MASK_PATTERN", 13);
        f16684e = r10;
        ?? r122 = new Enum("QR_COMPACT", 14);
        f16685f = r122;
        ?? r14 = new Enum("GS1_FORMAT", 15);
        h = r14;
        f16686n = new b[]{r02, r12, r32, r52, r72, r92, r11, r13, r15, r22, r42, r62, r82, r10, r122, r14, new Enum("FORCE_CODE_SET", 16), new Enum("FORCE_C40", 17), new Enum("CODE128_COMPACT", 18)};
    }

    public static b valueOf(String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    public static b[] values() {
        return (b[]) f16686n.clone();
    }
}
