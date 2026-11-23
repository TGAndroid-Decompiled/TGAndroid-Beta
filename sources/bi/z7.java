package bi;
public final class z7 {
    public static final z7 f4308a;
    public static final z7 f4309b;
    public static final z7 f4310c;
    public static final z7[] d;

    static {
        ?? r02 = new Enum("BY_PRICE", 0);
        f4308a = r02;
        ?? r12 = new Enum("BY_DATE", 1);
        f4309b = r12;
        ?? r32 = new Enum("BY_NUMBER", 2);
        f4310c = r32;
        d = new z7[]{r02, r12, r32};
    }

    public static z7 valueOf(String str) {
        return (z7) Enum.valueOf(z7.class, str);
    }

    public static z7[] values() {
        return (z7[]) d.clone();
    }
}
