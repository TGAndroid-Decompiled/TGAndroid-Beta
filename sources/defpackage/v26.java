package defpackage;
public final class v26 {
    public static final v26 a;
    public static final v26 b;
    public static final v26 c;
    public static final v26 d;
    public static final v26 e;
    public static final v26[] f;

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
        f = new v26[]{r0, r1, r3, r5, r7};
    }

    public static v26 valueOf(String str) {
        return (v26) Enum.valueOf(v26.class, str);
    }

    public static v26[] values() {
        return (v26[]) f.clone();
    }
}
