package defpackage;
public final class rs3 {
    public static final rs3 a;
    public static final rs3 b;
    public static final rs3 c;
    public static final rs3[] d;

    static {
        ?? r0 = new Enum("NONE", 0);
        a = r0;
        ?? r1 = new Enum("VERTICAL", 1);
        b = r1;
        ?? r3 = new Enum("FULL", 2);
        c = r3;
        d = new rs3[]{r0, r1, r3};
    }

    public static rs3 valueOf(String str) {
        return (rs3) Enum.valueOf(rs3.class, str);
    }

    public static rs3[] values() {
        return (rs3[]) d.clone();
    }
}
