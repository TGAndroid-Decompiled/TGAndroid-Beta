package defpackage;
public final class ly2 {
    public static final ly2 a;
    public static final ly2[] b;

    static {
        ?? r0 = new Enum("COROUTINE_SUSPENDED", 0);
        a = r0;
        b = new ly2[]{r0, new Enum("UNDECIDED", 1), new Enum("RESUMED", 2)};
    }

    public static ly2 valueOf(String str) {
        return (ly2) Enum.valueOf(ly2.class, str);
    }

    public static ly2[] values() {
        return (ly2[]) b.clone();
    }
}
