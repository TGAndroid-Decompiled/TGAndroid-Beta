package defpackage;
public final class rk5 {
    public static final rk5 a;
    public static final rk5 b;
    public static final rk5[] c;

    static {
        ?? r0 = new Enum("BACK", 0);
        a = r0;
        ?? r1 = new Enum("MENU", 1);
        b = r1;
        c = new rk5[]{r0, r1};
    }

    public static rk5 valueOf(String str) {
        return (rk5) Enum.valueOf(rk5.class, str);
    }

    public static rk5[] values() {
        return (rk5[]) c.clone();
    }
}
