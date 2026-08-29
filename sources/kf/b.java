package kf;
public final class b {
    public static final b f13635a;
    public static final b f13636b;
    public static final b[] f13637c;

    static {
        ?? r02 = new Enum("STARS", 0);
        f13635a = r02;
        ?? r12 = new Enum("TON", 1);
        f13636b = r12;
        f13637c = new b[]{r02, r12};
    }

    public static b valueOf(String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    public static b[] values() {
        return (b[]) f13637c.clone();
    }
}
