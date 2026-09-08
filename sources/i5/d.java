package i5;
public final class d {
    public static final d f11885a;
    public static final d f11886b;
    public static final d f11887c;
    public static final d[] d;

    static {
        ?? r02 = new Enum("DEFAULT", 0);
        f11885a = r02;
        ?? r12 = new Enum("VERY_LOW", 1);
        f11886b = r12;
        ?? r32 = new Enum("HIGHEST", 2);
        f11887c = r32;
        d = new d[]{r02, r12, r32};
    }

    public static d valueOf(String str) {
        return (d) Enum.valueOf(d.class, str);
    }

    public static d[] values() {
        return (d[]) d.clone();
    }
}
