package la;
public final class d {
    public static final d f12830a;
    public static final d[] f12831b;

    static {
        ?? r02 = new Enum("DEFAULT", 0);
        f12830a = r02;
        f12831b = new d[]{r02, new Enum("SIGNED", 1), new Enum("FIXED", 2)};
    }

    public static d valueOf(String str) {
        return (d) Enum.valueOf(d.class, str);
    }

    public static d[] values() {
        return (d[]) f12831b.clone();
    }
}
