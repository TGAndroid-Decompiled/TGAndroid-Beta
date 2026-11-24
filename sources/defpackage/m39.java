package defpackage;
public final class m39 {
    public static final m39 a;
    public static final m39 b;
    public static final m39[] c;
    m39 EF0;

    static {
        Enum r0 = new Enum("FULL_BACKGROUND", 0);
        Enum r1 = new Enum("SECTION_COLOR_BACKGROUND", 1);
        ?? r3 = new Enum("OPTIMIZED_BACKGROUND", 2);
        a = r3;
        ?? r5 = new Enum("DRAW_VERTICES", 3);
        b = r5;
        c = new m39[]{r0, r1, r3, r5};
    }

    public static m39 valueOf(String str) {
        return (m39) Enum.valueOf(m39.class, str);
    }

    public static m39[] values() {
        return (m39[]) c.clone();
    }
}
