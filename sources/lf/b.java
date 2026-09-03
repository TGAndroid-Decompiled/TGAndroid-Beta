package lf;
public final class b {
    public static final b f12056a;
    public static final b f12057b;
    public static final b[] f12058c;

    static {
        ?? r02 = new Enum("STARS", 0);
        f12056a = r02;
        ?? r12 = new Enum("TON", 1);
        f12057b = r12;
        f12058c = new b[]{r02, r12};
    }

    public static b valueOf(String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    public static b[] values() {
        return (b[]) f12058c.clone();
    }
}
