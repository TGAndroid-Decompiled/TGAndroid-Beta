package j5;
public final class d {
    public static final d f15513a;
    public static final d f15514b;
    public static final d f15515c;
    public static final d[] d;

    static {
        ?? r02 = new Enum("DEFAULT", 0);
        f15513a = r02;
        ?? r12 = new Enum("VERY_LOW", 1);
        f15514b = r12;
        ?? r32 = new Enum("HIGHEST", 2);
        f15515c = r32;
        d = new d[]{r02, r12, r32};
    }

    public static d valueOf(String str) {
        return (d) Enum.valueOf(d.class, str);
    }

    public static d[] values() {
        return (d[]) d.clone();
    }
}
