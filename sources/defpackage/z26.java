package defpackage;
public final class z26 {
    public static final z26 a;
    public static final z26 b;
    public static final z26 c;
    public static final z26 d;
    public static final z26 e;
    public static final z26[] f;

    static {
        ?? r0 = new Enum("DESTROYED", 0);
        a = r0;
        ?? r1 = new Enum("INITIALIZED", 1);
        b = r1;
        ?? r3 = new Enum("CREATED", 2);
        c = r3;
        ?? r5 = new Enum("STARTED", 3);
        d = r5;
        ?? r7 = new Enum("RESUMED", 4);
        e = r7;
        f = new z26[]{r0, r1, r3, r5, r7};
    }

    public static z26 valueOf(String str) {
        return (z26) Enum.valueOf(z26.class, str);
    }

    public static z26[] values() {
        return (z26[]) f.clone();
    }
}
