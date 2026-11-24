package defpackage;
public final class p99 {
    public static final p99 a;
    public static final p99 b;
    public static final p99 c;
    public static final p99[] d;

    static {
        ?? r0 = new Enum("BY_PRICE", 0);
        a = r0;
        ?? r1 = new Enum("BY_DATE", 1);
        b = r1;
        ?? r3 = new Enum("BY_NUMBER", 2);
        c = r3;
        d = new p99[]{r0, r1, r3};
    }

    public static p99 valueOf(String str) {
        return (p99) Enum.valueOf(p99.class, str);
    }

    public static p99[] values() {
        return (p99[]) d.clone();
    }
}
