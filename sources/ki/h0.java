package ki;
public final class h0 {
    public static final h0 f13726a;
    public static final h0 f13727b;
    public static final h0[] f13728c;

    static {
        ?? r02 = new Enum("FRONT", 0);
        f13726a = r02;
        ?? r12 = new Enum("BACK", 1);
        f13727b = r12;
        f13728c = new h0[]{r02, r12};
    }

    public static h0 valueOf(String str) {
        return (h0) Enum.valueOf(h0.class, str);
    }

    public static h0[] values() {
        return (h0[]) f13728c.clone();
    }
}
