package defpackage;
public final class s8a {
    public static final s8a a;
    public static final s8a b;
    public static final s8a[] c;

    static {
        ?? r0 = new Enum("CRASHLYTICS", 0);
        a = r0;
        ?? r1 = new Enum("PERFORMANCE", 1);
        b = r1;
        c = new s8a[]{r0, r1, new Enum("MATT_SAYS_HI", 2)};
    }

    public static s8a valueOf(String str) {
        return (s8a) Enum.valueOf(s8a.class, str);
    }

    public static s8a[] values() {
        return (s8a[]) c.clone();
    }
}
