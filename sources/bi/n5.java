package bi;
public final class n5 {
    public static final n5 f3737a;
    public static final n5 f3738b;
    public static final n5 f3739c;
    public static final n5[] d;

    static {
        ?? r02 = new Enum("BY_PRICE", 0);
        f3737a = r02;
        ?? r12 = new Enum("BY_DATE", 1);
        f3738b = r12;
        ?? r32 = new Enum("BY_NUMBER", 2);
        f3739c = r32;
        d = new n5[]{r02, r12, r32};
    }

    public static n5 valueOf(String str) {
        return (n5) Enum.valueOf(n5.class, str);
    }

    public static n5[] values() {
        return (n5[]) d.clone();
    }
}
