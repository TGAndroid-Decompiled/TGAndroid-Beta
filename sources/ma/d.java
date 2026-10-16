package ma;
public final class d {
    public static final d f15456a;
    public static final d[] f15457b;

    static {
        ?? r02 = new Enum("DEFAULT", 0);
        f15456a = r02;
        f15457b = new d[]{r02, new Enum("SIGNED", 1), new Enum("FIXED", 2)};
    }

    public static d valueOf(String str) {
        return (d) Enum.valueOf(d.class, str);
    }

    public static d[] values() {
        return (d[]) f15457b.clone();
    }
}
