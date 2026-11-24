package defpackage;
public final class y34 {
    public static final y34 E;
    public static final y34[] F;
    public static final y34 a;
    public static final y34 b;
    public static final y34 c;
    public static final y34 d;
    public static final y34 e;
    public static final y34 f;
    public static final y34 h;
    public static final y34 n;
    public static final y34 r;
    public static final y34 s;
    public static final y34 w;
    public static final y34 x;
    public static final y34 y;

    static {
        ?? r0 = new Enum("ERROR_CORRECTION", 0);
        a = r0;
        ?? r1 = new Enum("CHARACTER_SET", 1);
        b = r1;
        Enum r3 = new Enum("DATA_MATRIX_SHAPE", 2);
        Enum r5 = new Enum("DATA_MATRIX_COMPACT", 3);
        Enum r7 = new Enum("MIN_SIZE", 4);
        Enum r9 = new Enum("MAX_SIZE", 5);
        ?? r11 = new Enum("MARGIN", 6);
        c = r11;
        ?? r13 = new Enum("PDF417_COMPACT", 7);
        d = r13;
        ?? r15 = new Enum("PDF417_COMPACTION", 8);
        e = r15;
        ?? r2 = new Enum("PDF417_DIMENSIONS", 9);
        f = r2;
        ?? r4 = new Enum("PDF417_AUTO_ECI", 10);
        h = r4;
        ?? r6 = new Enum("AZTEC_LAYERS", 11);
        n = r6;
        ?? r8 = new Enum("QR_VERSION", 12);
        r = r8;
        ?? r10 = new Enum("QR_MASK_PATTERN", 13);
        s = r10;
        ?? r12 = new Enum("QR_COMPACT", 14);
        w = r12;
        ?? r14 = new Enum("GS1_FORMAT", 15);
        x = r14;
        ?? r02 = new Enum("FORCE_CODE_SET", 16);
        y = r02;
        Enum r16 = new Enum("FORCE_C40", 17);
        ?? r22 = new Enum("CODE128_COMPACT", 18);
        E = r22;
        F = new y34[]{r0, r1, r3, r5, r7, r9, r11, r13, r15, r2, r4, r6, r8, r10, r12, r14, r02, r16, r22};
    }

    public static y34 valueOf(String str) {
        return (y34) Enum.valueOf(y34.class, str);
    }

    public static y34[] values() {
        return (y34[]) F.clone();
    }
}
