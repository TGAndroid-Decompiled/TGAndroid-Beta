package ki;
public final class m0 {
    public static final m0 f15056a;
    public static final m0 f15057b;
    public static final m0[] f15058c;

    static {
        ?? r02 = new Enum("FRONT", 0);
        f15056a = r02;
        ?? r12 = new Enum("BACK", 1);
        f15057b = r12;
        f15058c = new m0[]{r02, r12};
    }

    public static m0 valueOf(String str) {
        return (m0) Enum.valueOf(m0.class, str);
    }

    public static m0[] values() {
        return (m0[]) f15058c.clone();
    }
}
