package defpackage;
public final class bu3 {
    public static final bu3 a;
    public static final bu3 b;
    public static final bu3 c;
    public static final bu3[] d;

    static {
        ?? r0 = new Enum("NONE", 0);
        a = r0;
        ?? r1 = new Enum("VERTICAL", 1);
        b = r1;
        ?? r3 = new Enum("FULL", 2);
        c = r3;
        d = new bu3[]{r0, r1, r3};
    }

    public static bu3 valueOf(String str) {
        return (bu3) Enum.valueOf(bu3.class, str);
    }

    public static bu3[] values() {
        return (bu3[]) d.clone();
    }
}
