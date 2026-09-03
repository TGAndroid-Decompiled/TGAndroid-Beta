package j7;
public final class h {
    public static final h f8994a;
    public static final h[] f8995b;

    static {
        ?? r02 = new Enum("DEFAULT", 0);
        f8994a = r02;
        f8995b = new h[]{r02, new Enum("SIGNED", 1), new Enum("FIXED", 2)};
    }

    public static h[] values() {
        return (h[]) f8995b.clone();
    }
}
