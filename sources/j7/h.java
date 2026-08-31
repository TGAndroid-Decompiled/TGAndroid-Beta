package j7;
public final class h {
    public static final h f9625a;
    public static final h[] f9626b;

    static {
        ?? r02 = new Enum("DEFAULT", 0);
        f9625a = r02;
        f9626b = new h[]{r02, new Enum("SIGNED", 1), new Enum("FIXED", 2)};
    }

    public static h[] values() {
        return (h[]) f9626b.clone();
    }
}
