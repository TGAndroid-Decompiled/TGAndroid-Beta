package defpackage;
public final class ok {
    public static final ok a;
    public static final ok b;
    public static final ok[] c;

    static {
        ?? r0 = new Enum("STARS", 0);
        a = r0;
        ?? r1 = new Enum("TON", 1);
        b = r1;
        c = new ok[]{r0, r1};
    }

    public static ok valueOf(String str) {
        return (ok) Enum.valueOf(ok.class, str);
    }

    public static ok[] values() {
        return (ok[]) c.clone();
    }
}
