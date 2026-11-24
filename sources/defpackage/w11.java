package defpackage;
public final class w11 {
    public static final w11 a;
    public static final w11 b;
    public static final w11 c;
    public static final w11[] d;

    static {
        ?? r0 = new Enum("SUSPEND", 0);
        a = r0;
        ?? r1 = new Enum("DROP_OLDEST", 1);
        b = r1;
        ?? r3 = new Enum("DROP_LATEST", 2);
        c = r3;
        d = new w11[]{r0, r1, r3};
    }

    public static w11 valueOf(String str) {
        return (w11) Enum.valueOf(w11.class, str);
    }

    public static w11[] values() {
        return (w11[]) d.clone();
    }
}
