package defpackage;
public final class sx5 {
    public static final sx5 a;
    public static final sx5 b;
    public static final sx5 c;
    public static final sx5 d;
    public static final sx5[] e;

    static {
        ?? r0 = new Enum("STATE_FULLY_HIDDEN", 0);
        a = r0;
        ?? r1 = new Enum("STATE_ANIMATING_TO_FULLY_HIDDEN", 1);
        b = r1;
        ?? r3 = new Enum("STATE_ANIMATING_TO_FULLY_VISIBLE", 2);
        c = r3;
        ?? r5 = new Enum("STATE_FULLY_VISIBLE", 3);
        d = r5;
        e = new sx5[]{r0, r1, r3, r5};
    }

    public static sx5 valueOf(String str) {
        return (sx5) Enum.valueOf(sx5.class, str);
    }

    public static sx5[] values() {
        return (sx5[]) e.clone();
    }
}
