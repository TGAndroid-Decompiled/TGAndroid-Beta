package defpackage;
public final class lgb {
    public static final lgb a;
    public static final lgb b;
    public static final lgb c;
    public static final lgb[] d;

    static {
        ?? r0 = new Enum("LEFT", 0);
        a = r0;
        ?? r1 = new Enum("CENTER", 1);
        b = r1;
        ?? r3 = new Enum("RIGHT", 2);
        c = r3;
        d = new lgb[]{r0, r1, r3};
    }

    public static lgb valueOf(String str) {
        return (lgb) Enum.valueOf(lgb.class, str);
    }

    public static lgb[] values() {
        return (lgb[]) d.clone();
    }
}
