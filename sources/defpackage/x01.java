package defpackage;
public final class x01 {
    public static final x01 a;
    public static final x01 b;
    public static final x01 c;
    public static final x01[] d;

    static {
        ?? r0 = new Enum("SUSPEND", 0);
        a = r0;
        ?? r1 = new Enum("DROP_OLDEST", 1);
        b = r1;
        ?? r3 = new Enum("DROP_LATEST", 2);
        c = r3;
        d = new x01[]{r0, r1, r3};
    }

    public static x01 valueOf(String str) {
        return (x01) Enum.valueOf(x01.class, str);
    }

    public static x01[] values() {
        return (x01[]) d.clone();
    }
}
