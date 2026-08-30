package mf;
public final class b {
    public static final b f13930a;
    public static final b f13931b;
    public static final b[] f13932c;

    static {
        ?? r02 = new Enum("STARS", 0);
        f13930a = r02;
        ?? r12 = new Enum("TON", 1);
        f13931b = r12;
        f13932c = new b[]{r02, r12};
    }

    public static b valueOf(String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    public static b[] values() {
        return (b[]) f13932c.clone();
    }
}
