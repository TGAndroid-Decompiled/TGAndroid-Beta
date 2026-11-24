package defpackage;
public final class p59 {
    public static final p59 a;
    public static final p59 b;
    public static final p59[] c;
    p59 EF0;

    static {
        Enum r0 = new Enum("FULL_BACKGROUND", 0);
        Enum r1 = new Enum("SECTION_COLOR_BACKGROUND", 1);
        ?? r3 = new Enum("OPTIMIZED_BACKGROUND", 2);
        a = r3;
        ?? r5 = new Enum("DRAW_VERTICES", 3);
        b = r5;
        c = new p59[]{r0, r1, r3, r5};
    }

    public static p59 valueOf(String str) {
        return (p59) Enum.valueOf(p59.class, str);
    }

    public static p59[] values() {
        return (p59[]) c.clone();
    }
}
