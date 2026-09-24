package ki;
public final class l0 {
    public static final l0 f13784a;
    public static final l0 f13785b;
    public static final l0 f13786c;
    public static final l0[] d;

    static {
        ?? r02 = new Enum("HIGH", 0);
        f13784a = r02;
        ?? r12 = new Enum("MEDIUM", 1);
        f13785b = r12;
        ?? r32 = new Enum("LOW", 2);
        f13786c = r32;
        d = new l0[]{r02, r12, r32};
    }

    public static l0 valueOf(String str) {
        return (l0) Enum.valueOf(l0.class, str);
    }

    public static l0[] values() {
        return (l0[]) d.clone();
    }
}
