package cg;
public final class b {
    public static final b f5305a;
    public static final b f5306b;
    public static final b[] f5307c;

    static {
        ?? r02 = new Enum("STARS", 0);
        f5305a = r02;
        ?? r12 = new Enum("TON", 1);
        f5306b = r12;
        f5307c = new b[]{r02, r12};
    }

    public static b valueOf(String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    public static b[] values() {
        return (b[]) f5307c.clone();
    }
}
