package defpackage;
public final class nv5 {
    public static final nv5 a;
    public static final nv5 b;
    public static final nv5 c;
    public static final nv5 d;
    public static final nv5[] e;

    static {
        ?? r0 = new Enum("STATE_FULLY_HIDDEN", 0);
        a = r0;
        ?? r1 = new Enum("STATE_ANIMATING_TO_FULLY_HIDDEN", 1);
        b = r1;
        ?? r3 = new Enum("STATE_ANIMATING_TO_FULLY_VISIBLE", 2);
        c = r3;
        ?? r5 = new Enum("STATE_FULLY_VISIBLE", 3);
        d = r5;
        e = new nv5[]{r0, r1, r3, r5};
    }

    public static nv5 valueOf(String str) {
        return (nv5) Enum.valueOf(nv5.class, str);
    }

    public static nv5[] values() {
        return (nv5[]) e.clone();
    }
}
