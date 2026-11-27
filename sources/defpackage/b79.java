package defpackage;
public final class b79 {
    public static final b79 a;
    public static final b79 b;
    public static final b79[] c;
    b79 EF0;

    static {
        Enum r0 = new Enum("FULL_BACKGROUND", 0);
        Enum r1 = new Enum("SECTION_COLOR_BACKGROUND", 1);
        ?? r3 = new Enum("OPTIMIZED_BACKGROUND", 2);
        a = r3;
        ?? r5 = new Enum("DRAW_VERTICES", 3);
        b = r5;
        c = new b79[]{r0, r1, r3, r5};
    }

    public static b79 valueOf(String str) {
        return (b79) Enum.valueOf(b79.class, str);
    }

    public static b79[] values() {
        return (b79[]) c.clone();
    }
}
