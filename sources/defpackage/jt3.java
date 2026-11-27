package defpackage;
public final class jt3 {
    public static final jt3 a;
    public static final jt3 b;
    public static final jt3 c;
    public static final jt3[] d;

    static {
        ?? r0 = new Enum("NONE", 0);
        a = r0;
        ?? r1 = new Enum("VERTICAL", 1);
        b = r1;
        ?? r3 = new Enum("FULL", 2);
        c = r3;
        d = new jt3[]{r0, r1, r3};
    }

    public static jt3 valueOf(String str) {
        return (jt3) Enum.valueOf(jt3.class, str);
    }

    public static jt3[] values() {
        return (jt3[]) d.clone();
    }
}
