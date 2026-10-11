package ki;
public final class p0 {
    public static final p0 f15081a;
    public static final p0 f15082b;
    public static final p0 f15083c;
    public static final p0[] d;

    static {
        ?? r02 = new Enum("HIGH", 0);
        f15081a = r02;
        ?? r12 = new Enum("MEDIUM", 1);
        f15082b = r12;
        ?? r32 = new Enum("LOW", 2);
        f15083c = r32;
        d = new p0[]{r02, r12, r32};
    }

    public static p0 valueOf(String str) {
        return (p0) Enum.valueOf(p0.class, str);
    }

    public static p0[] values() {
        return (p0[]) d.clone();
    }
}
