package ki;
public final class o0 {
    public static final o0 f15076a;
    public static final o0 f15077b;
    public static final o0[] f15078c;

    static {
        ?? r02 = new Enum("FRONT", 0);
        f15076a = r02;
        ?? r12 = new Enum("BACK", 1);
        f15077b = r12;
        f15078c = new o0[]{r02, r12};
    }

    public static o0 valueOf(String str) {
        return (o0) Enum.valueOf(o0.class, str);
    }

    public static o0[] values() {
        return (o0[]) f15078c.clone();
    }
}
