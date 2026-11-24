package defpackage;
public final class nx5 {
    public static final nx5 a;
    public static final nx5 b;
    public static final nx5 c;
    public static final nx5 d;
    public static final nx5[] e;

    static {
        ?? r0 = new Enum("STATE_FULLY_HIDDEN", 0);
        a = r0;
        ?? r1 = new Enum("STATE_ANIMATING_TO_FULLY_HIDDEN", 1);
        b = r1;
        ?? r3 = new Enum("STATE_ANIMATING_TO_FULLY_VISIBLE", 2);
        c = r3;
        ?? r5 = new Enum("STATE_FULLY_VISIBLE", 3);
        d = r5;
        e = new nx5[]{r0, r1, r3, r5};
    }

    public static nx5 valueOf(String str) {
        return (nx5) Enum.valueOf(nx5.class, str);
    }

    public static nx5[] values() {
        return (nx5[]) e.clone();
    }
}
