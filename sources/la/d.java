package la;
public final class d {
    public static final d f15388a;
    public static final d[] f15389b;

    static {
        ?? r02 = new Enum("DEFAULT", 0);
        f15388a = r02;
        f15389b = new d[]{r02, new Enum("SIGNED", 1), new Enum("FIXED", 2)};
    }

    public static d valueOf(String str) {
        return (d) Enum.valueOf(d.class, str);
    }

    public static d[] values() {
        return (d[]) f15389b.clone();
    }
}
