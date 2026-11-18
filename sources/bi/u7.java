package bi;
public final class u7 {
    public static final u7 f4121a;
    public static final u7 f4122b;
    public static final u7 f4123c;
    public static final u7[] d;

    static {
        ?? r02 = new Enum("BY_PRICE", 0);
        f4121a = r02;
        ?? r12 = new Enum("BY_DATE", 1);
        f4122b = r12;
        ?? r32 = new Enum("BY_NUMBER", 2);
        f4123c = r32;
        d = new u7[]{r02, r12, r32};
    }

    public static u7 valueOf(String str) {
        return (u7) Enum.valueOf(u7.class, str);
    }

    public static u7[] values() {
        return (u7[]) d.clone();
    }
}
