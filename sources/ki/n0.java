package ki;
public final class n0 {
    public static final n0 f15062a;
    public static final n0 f15063b;
    public static final n0 f15064c;
    public static final n0[] d;

    static {
        ?? r02 = new Enum("HIGH", 0);
        f15062a = r02;
        ?? r12 = new Enum("MEDIUM", 1);
        f15063b = r12;
        ?? r32 = new Enum("LOW", 2);
        f15064c = r32;
        d = new n0[]{r02, r12, r32};
    }

    public static n0 valueOf(String str) {
        return (n0) Enum.valueOf(n0.class, str);
    }

    public static n0[] values() {
        return (n0[]) d.clone();
    }
}
