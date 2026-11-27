package defpackage;
public final class dd9 {
    public static final dd9 a;
    public static final dd9 b;
    public static final dd9 c;
    public static final dd9[] d;

    static {
        ?? r0 = new Enum("BY_PRICE", 0);
        a = r0;
        ?? r1 = new Enum("BY_DATE", 1);
        b = r1;
        ?? r3 = new Enum("BY_NUMBER", 2);
        c = r3;
        d = new dd9[]{r0, r1, r3};
    }

    public static dd9 valueOf(String str) {
        return (dd9) Enum.valueOf(dd9.class, str);
    }

    public static dd9[] values() {
        return (dd9[]) d.clone();
    }
}
