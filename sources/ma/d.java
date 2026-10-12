package ma;
public final class d {
    public static final d f15721a;
    public static final d[] f15722b;

    static {
        ?? r02 = new Enum("DEFAULT", 0);
        f15721a = r02;
        f15722b = new d[]{r02, new Enum("SIGNED", 1), new Enum("FIXED", 2)};
    }

    public static d valueOf(String str) {
        return (d) Enum.valueOf(d.class, str);
    }

    public static d[] values() {
        return (d[]) f15722b.clone();
    }
}
