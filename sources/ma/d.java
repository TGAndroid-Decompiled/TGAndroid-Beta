package ma;
public final class d {
    public static final d f16813a;
    public static final d[] f16814b;

    static {
        ?? r02 = new Enum("DEFAULT", 0);
        f16813a = r02;
        f16814b = new d[]{r02, new Enum("SIGNED", 1), new Enum("FIXED", 2)};
    }

    public static d valueOf(String str) {
        return (d) Enum.valueOf(d.class, str);
    }

    public static d[] values() {
        return (d[]) f16814b.clone();
    }
}
