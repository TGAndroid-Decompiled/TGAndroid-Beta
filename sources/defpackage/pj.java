package defpackage;
public final class pj {
    public static final pj a;
    public static final pj b;
    public static final pj[] c;

    static {
        ?? r0 = new Enum("STARS", 0);
        a = r0;
        ?? r1 = new Enum("TON", 1);
        b = r1;
        c = new pj[]{r0, r1};
    }

    public static pj valueOf(String str) {
        return (pj) Enum.valueOf(pj.class, str);
    }

    public static pj[] values() {
        return (pj[]) c.clone();
    }
}
