package bi;
public final class x7 {
    public static final x7 f4253a;
    public static final x7 f4254b;
    public static final x7 f4255c;
    public static final x7[] d;

    static {
        ?? r02 = new Enum("BY_PRICE", 0);
        f4253a = r02;
        ?? r12 = new Enum("BY_DATE", 1);
        f4254b = r12;
        ?? r32 = new Enum("BY_NUMBER", 2);
        f4255c = r32;
        d = new x7[]{r02, r12, r32};
    }

    public static x7 valueOf(String str) {
        return (x7) Enum.valueOf(x7.class, str);
    }

    public static x7[] values() {
        return (x7[]) d.clone();
    }
}
