package ki;
public final class i0 {
    public static final i0 f13731a;
    public static final i0 f13732b;
    public static final i0 f13733c;
    public static final i0[] d;

    static {
        ?? r02 = new Enum("HIGH", 0);
        f13731a = r02;
        ?? r12 = new Enum("MEDIUM", 1);
        f13732b = r12;
        ?? r32 = new Enum("LOW", 2);
        f13733c = r32;
        d = new i0[]{r02, r12, r32};
    }

    public static i0 valueOf(String str) {
        return (i0) Enum.valueOf(i0.class, str);
    }

    public static i0[] values() {
        return (i0[]) d.clone();
    }
}
