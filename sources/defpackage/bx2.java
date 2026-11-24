package defpackage;
public final class bx2 {
    public static final bx2 a;
    public static final bx2[] b;

    static {
        ?? r0 = new Enum("COROUTINE_SUSPENDED", 0);
        a = r0;
        b = new bx2[]{r0, new Enum("UNDECIDED", 1), new Enum("RESUMED", 2)};
    }

    public static bx2 valueOf(String str) {
        return (bx2) Enum.valueOf(bx2.class, str);
    }

    public static bx2[] values() {
        return (bx2[]) b.clone();
    }
}
