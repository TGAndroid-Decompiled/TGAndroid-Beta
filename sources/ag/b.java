package ag;
public final class b {
    public static final b f629a;
    public static final b f630b;
    public static final b[] f631c;

    static {
        ?? r02 = new Enum("STARS", 0);
        f629a = r02;
        ?? r12 = new Enum("TON", 1);
        f630b = r12;
        f631c = new b[]{r02, r12};
    }

    public static b valueOf(String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    public static b[] values() {
        return (b[]) f631c.clone();
    }
}
