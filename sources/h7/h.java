package h7;
public final class h {
    public static final h f7632a;
    public static final h[] f7633b;

    static {
        ?? r02 = new Enum("DEFAULT", 0);
        f7632a = r02;
        f7633b = new h[]{r02, new Enum("SIGNED", 1), new Enum("FIXED", 2)};
    }

    public static h[] values() {
        return (h[]) f7633b.clone();
    }
}
