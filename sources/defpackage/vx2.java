package defpackage;
public final class vx2 {
    public static final vx2 a;
    public static final vx2[] b;

    static {
        ?? r0 = new Enum("COROUTINE_SUSPENDED", 0);
        a = r0;
        b = new vx2[]{r0, new Enum("UNDECIDED", 1), new Enum("RESUMED", 2)};
    }

    public static vx2 valueOf(String str) {
        return (vx2) Enum.valueOf(vx2.class, str);
    }

    public static vx2[] values() {
        return (vx2[]) b.clone();
    }
}
