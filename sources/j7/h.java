package j7;
public final class h {
    public static final h f9020a;
    public static final h[] f9021b;

    static {
        ?? r02 = new Enum("DEFAULT", 0);
        f9020a = r02;
        f9021b = new h[]{r02, new Enum("SIGNED", 1), new Enum("FIXED", 2)};
    }

    public static h[] values() {
        return (h[]) f9021b.clone();
    }
}
