package ag;
public final class b {
    public static final b f633a;
    public static final b f634b;
    public static final b[] f635c;

    static {
        ?? r02 = new Enum("STARS", 0);
        f633a = r02;
        ?? r12 = new Enum("TON", 1);
        f634b = r12;
        f635c = new b[]{r02, r12};
    }

    public static b valueOf(String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    public static b[] values() {
        return (b[]) f635c.clone();
    }
}
