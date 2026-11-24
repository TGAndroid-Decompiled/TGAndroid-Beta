package defpackage;
public final class gxb {
    public static final gxb a;
    public static final gxb b;
    public static final gxb c;
    public static final gxb[] d;

    static {
        ?? r0 = new Enum("TOP", 0);
        a = r0;
        ?? r1 = new Enum("LEFT", 1);
        b = r1;
        ?? r3 = new Enum("BOTTOM", 2);
        c = r3;
        d = new gxb[]{r0, r1, r3};
    }

    public static gxb valueOf(String str) {
        return (gxb) Enum.valueOf(gxb.class, str);
    }

    public static gxb[] values() {
        return (gxb[]) d.clone();
    }
}
