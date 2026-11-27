package defpackage;
public final class dp9 {
    public static final dp9 a;
    public static final dp9 b;
    public static final dp9 c;
    public static final dp9[] d;

    static {
        ?? r0 = new Enum("HIGH", 0);
        a = r0;
        ?? r1 = new Enum("MEDIUM", 1);
        b = r1;
        ?? r3 = new Enum("LOW", 2);
        c = r3;
        d = new dp9[]{r0, r1, r3};
    }

    public static dp9 valueOf(String str) {
        return (dp9) Enum.valueOf(dp9.class, str);
    }

    public static dp9[] values() {
        return (dp9[]) d.clone();
    }
}
