package lb;

public final class b {

    public static final b f15507a;

    public static final b f15508b;

    public static final b f15509c;
    public static final b d;

    public static final b f15510e;

    public static final b f15511f;
    public static final b h;

    public static final b[] f15512n;

    static {
        b bVar = new b("ERROR_CORRECTION", 0);
        f15507a = bVar;
        b bVar2 = new b("CHARACTER_SET", 1);
        f15508b = bVar2;
        b bVar3 = new b("DATA_MATRIX_SHAPE", 2);
        b bVar4 = new b("DATA_MATRIX_COMPACT", 3);
        b bVar5 = new b("MIN_SIZE", 4);
        b bVar6 = new b("MAX_SIZE", 5);
        b bVar7 = new b("MARGIN", 6);
        f15509c = bVar7;
        b bVar8 = new b("PDF417_COMPACT", 7);
        b bVar9 = new b("PDF417_COMPACTION", 8);
        b bVar10 = new b("PDF417_DIMENSIONS", 9);
        b bVar11 = new b("PDF417_AUTO_ECI", 10);
        b bVar12 = new b("AZTEC_LAYERS", 11);
        b bVar13 = new b("QR_VERSION", 12);
        d = bVar13;
        b bVar14 = new b("QR_MASK_PATTERN", 13);
        f15510e = bVar14;
        b bVar15 = new b("QR_COMPACT", 14);
        f15511f = bVar15;
        b bVar16 = new b("GS1_FORMAT", 15);
        h = bVar16;
        f15512n = new b[]{bVar, bVar2, bVar3, bVar4, bVar5, bVar6, bVar7, bVar8, bVar9, bVar10, bVar11, bVar12, bVar13, bVar14, bVar15, bVar16, new b("FORCE_CODE_SET", 16), new b("FORCE_C40", 17), new b("CODE128_COMPACT", 18)};
    }

    public static b valueOf(String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    public static b[] values() {
        return (b[]) f15512n.clone();
    }
}
