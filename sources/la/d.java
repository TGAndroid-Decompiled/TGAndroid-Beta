package la;
public final class d {
    public static final d f13921a;
    public static final d[] f13922b;

    static {
        ?? r02 = new Enum("DEFAULT", 0);
        f13921a = r02;
        f13922b = new d[]{r02, new Enum("SIGNED", 1), new Enum("FIXED", 2)};
    }

    public static d valueOf(String str) {
        return (d) Enum.valueOf(d.class, str);
    }

    public static d[] values() {
        return (d[]) f13922b.clone();
    }
}
