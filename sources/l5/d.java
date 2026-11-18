package l5;
public final class d {
    public static final d f19672a;
    public static final d f19673b;
    public static final d f19674c;
    public static final d[] d;

    static {
        ?? r02 = new Enum("DEFAULT", 0);
        f19672a = r02;
        ?? r12 = new Enum("VERY_LOW", 1);
        f19673b = r12;
        ?? r32 = new Enum("HIGHEST", 2);
        f19674c = r32;
        d = new d[]{r02, r12, r32};
    }

    public static d valueOf(String str) {
        return (d) Enum.valueOf(d.class, str);
    }

    public static d[] values() {
        return (d[]) d.clone();
    }
}
