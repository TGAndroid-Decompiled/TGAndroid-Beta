package bi;
public final class t7 {
    public static final t7 f4068a;
    public static final t7 f4069b;
    public static final t7 f4070c;
    public static final t7[] d;

    static {
        ?? r02 = new Enum("BY_PRICE", 0);
        f4068a = r02;
        ?? r12 = new Enum("BY_DATE", 1);
        f4069b = r12;
        ?? r32 = new Enum("BY_NUMBER", 2);
        f4070c = r32;
        d = new t7[]{r02, r12, r32};
    }

    public static t7 valueOf(String str) {
        return (t7) Enum.valueOf(t7.class, str);
    }

    public static t7[] values() {
        return (t7[]) d.clone();
    }
}
