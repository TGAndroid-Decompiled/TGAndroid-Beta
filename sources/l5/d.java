package l5;
public final class d {
    public static final d f19703a;
    public static final d f19704b;
    public static final d f19705c;
    public static final d[] d;

    static {
        ?? r02 = new Enum("DEFAULT", 0);
        f19703a = r02;
        ?? r12 = new Enum("VERY_LOW", 1);
        f19704b = r12;
        ?? r32 = new Enum("HIGHEST", 2);
        f19705c = r32;
        d = new d[]{r02, r12, r32};
    }

    public static d valueOf(String str) {
        return (d) Enum.valueOf(d.class, str);
    }

    public static d[] values() {
        return (d[]) d.clone();
    }
}
