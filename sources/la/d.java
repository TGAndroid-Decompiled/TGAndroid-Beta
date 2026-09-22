package la;
public final class d {
    public static final d f14145a;
    public static final d[] f14146b;

    static {
        ?? r02 = new Enum("DEFAULT", 0);
        f14145a = r02;
        f14146b = new d[]{r02, new Enum("SIGNED", 1), new Enum("FIXED", 2)};
    }

    public static d valueOf(String str) {
        return (d) Enum.valueOf(d.class, str);
    }

    public static d[] values() {
        return (d[]) f14146b.clone();
    }
}
