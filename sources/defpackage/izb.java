package defpackage;
public final class izb {
    public static final izb a;
    public static final izb b;
    public static final izb c;
    public static final izb[] d;

    static {
        ?? r0 = new Enum("TOP", 0);
        a = r0;
        ?? r1 = new Enum("LEFT", 1);
        b = r1;
        ?? r3 = new Enum("BOTTOM", 2);
        c = r3;
        d = new izb[]{r0, r1, r3};
    }

    public static izb valueOf(String str) {
        return (izb) Enum.valueOf(izb.class, str);
    }

    public static izb[] values() {
        return (izb[]) d.clone();
    }
}
