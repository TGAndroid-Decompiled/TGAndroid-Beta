package f7;
public final class h {
    public static final h f5687a;
    public static final h[] f5688b;

    static {
        ?? r02 = new Enum("DEFAULT", 0);
        f5687a = r02;
        f5688b = new h[]{r02, new Enum("SIGNED", 1), new Enum("FIXED", 2)};
    }

    public static h[] values() {
        return (h[]) f5688b.clone();
    }
}
