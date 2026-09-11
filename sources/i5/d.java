package i5;
public final class d {
    public static final d f11859a;
    public static final d f11860b;
    public static final d f11861c;
    public static final d[] d;

    static {
        ?? r02 = new Enum("DEFAULT", 0);
        f11859a = r02;
        ?? r12 = new Enum("VERY_LOW", 1);
        f11860b = r12;
        ?? r32 = new Enum("HIGHEST", 2);
        f11861c = r32;
        d = new d[]{r02, r12, r32};
    }

    public static d valueOf(String str) {
        return (d) Enum.valueOf(d.class, str);
    }

    public static d[] values() {
        return (d[]) d.clone();
    }
}
