package ki;
public final class j0 {
    public static final j0 f13766a;
    public static final j0 f13767b;
    public static final j0 f13768c;
    public static final j0[] d;

    static {
        ?? r02 = new Enum("HIGH", 0);
        f13766a = r02;
        ?? r12 = new Enum("MEDIUM", 1);
        f13767b = r12;
        ?? r32 = new Enum("LOW", 2);
        f13768c = r32;
        d = new j0[]{r02, r12, r32};
    }

    public static j0 valueOf(String str) {
        return (j0) Enum.valueOf(j0.class, str);
    }

    public static j0[] values() {
        return (j0[]) d.clone();
    }
}
