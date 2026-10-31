package ma;
public final class d {
    public static final d f13036a;
    public static final d[] f13037b;

    static {
        ?? r02 = new Enum("DEFAULT", 0);
        f13036a = r02;
        f13037b = new d[]{r02, new Enum("SIGNED", 1), new Enum("FIXED", 2)};
    }

    public static d valueOf(String str) {
        return (d) Enum.valueOf(d.class, str);
    }

    public static d[] values() {
        return (d[]) f13037b.clone();
    }
}
