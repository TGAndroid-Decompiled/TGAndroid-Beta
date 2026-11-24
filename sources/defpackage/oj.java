package defpackage;
public final class oj {
    public static final oj a;
    public static final oj b;
    public static final oj[] c;

    static {
        ?? r0 = new Enum("STARS", 0);
        a = r0;
        ?? r1 = new Enum("TON", 1);
        b = r1;
        c = new oj[]{r0, r1};
    }

    public static oj valueOf(String str) {
        return (oj) Enum.valueOf(oj.class, str);
    }

    public static oj[] values() {
        return (oj[]) c.clone();
    }
}
