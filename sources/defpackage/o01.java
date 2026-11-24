package defpackage;
public final class o01 {
    public static final o01 a;
    public static final o01 b;
    public static final o01 c;
    public static final o01[] d;

    static {
        ?? r0 = new Enum("SUSPEND", 0);
        a = r0;
        ?? r1 = new Enum("DROP_OLDEST", 1);
        b = r1;
        ?? r3 = new Enum("DROP_LATEST", 2);
        c = r3;
        d = new o01[]{r0, r1, r3};
    }

    public static o01 valueOf(String str) {
        return (o01) Enum.valueOf(o01.class, str);
    }

    public static o01[] values() {
        return (o01[]) d.clone();
    }
}
