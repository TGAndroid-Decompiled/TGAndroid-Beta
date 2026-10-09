package i5;
public final class d {
    public static final d f12014a;
    public static final d f12015b;
    public static final d f12016c;
    public static final d[] d;

    static {
        ?? r02 = new Enum("DEFAULT", 0);
        f12014a = r02;
        ?? r12 = new Enum("VERY_LOW", 1);
        f12015b = r12;
        ?? r32 = new Enum("HIGHEST", 2);
        f12016c = r32;
        d = new d[]{r02, r12, r32};
    }

    public static d valueOf(String str) {
        return (d) Enum.valueOf(d.class, str);
    }

    public static d[] values() {
        return (d[]) d.clone();
    }
}
