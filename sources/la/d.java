package la;
public final class d {
    public static final d f14141a;
    public static final d[] f14142b;

    static {
        ?? r02 = new Enum("DEFAULT", 0);
        f14141a = r02;
        f14142b = new d[]{r02, new Enum("SIGNED", 1), new Enum("FIXED", 2)};
    }

    public static d valueOf(String str) {
        return (d) Enum.valueOf(d.class, str);
    }

    public static d[] values() {
        return (d[]) f14142b.clone();
    }
}
