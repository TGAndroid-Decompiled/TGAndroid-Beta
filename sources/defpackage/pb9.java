package defpackage;
public final class pb9 {
    public static final pb9 a;
    public static final pb9 b;
    public static final pb9 c;
    public static final pb9[] d;

    static {
        ?? r0 = new Enum("BY_PRICE", 0);
        a = r0;
        ?? r1 = new Enum("BY_DATE", 1);
        b = r1;
        ?? r3 = new Enum("BY_NUMBER", 2);
        c = r3;
        d = new pb9[]{r0, r1, r3};
    }

    public static pb9 valueOf(String str) {
        return (pb9) Enum.valueOf(pb9.class, str);
    }

    public static pb9[] values() {
        return (pb9[]) d.clone();
    }
}
