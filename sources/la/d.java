package la;
public final class d {
    public static final d f14157a;
    public static final d[] f14158b;

    static {
        ?? r02 = new Enum("DEFAULT", 0);
        f14157a = r02;
        f14158b = new d[]{r02, new Enum("SIGNED", 1), new Enum("FIXED", 2)};
    }

    public static d valueOf(String str) {
        return (d) Enum.valueOf(d.class, str);
    }

    public static d[] values() {
        return (d[]) f14158b.clone();
    }
}
