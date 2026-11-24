package defpackage;
public final class q6a {
    public static final q6a a;
    public static final q6a b;
    public static final q6a[] c;

    static {
        ?? r0 = new Enum("CRASHLYTICS", 0);
        a = r0;
        ?? r1 = new Enum("PERFORMANCE", 1);
        b = r1;
        c = new q6a[]{r0, r1, new Enum("MATT_SAYS_HI", 2)};
    }

    public static q6a valueOf(String str) {
        return (q6a) Enum.valueOf(q6a.class, str);
    }

    public static q6a[] values() {
        return (q6a[]) c.clone();
    }
}
