package i5;
public final class d {
    public static final d f12012a;
    public static final d f12013b;
    public static final d f12014c;
    public static final d[] d;

    static {
        ?? r02 = new Enum("DEFAULT", 0);
        f12012a = r02;
        ?? r12 = new Enum("VERY_LOW", 1);
        f12013b = r12;
        ?? r32 = new Enum("HIGHEST", 2);
        f12014c = r32;
        d = new d[]{r02, r12, r32};
    }

    public static d valueOf(String str) {
        return (d) Enum.valueOf(d.class, str);
    }

    public static d[] values() {
        return (d[]) d.clone();
    }
}
