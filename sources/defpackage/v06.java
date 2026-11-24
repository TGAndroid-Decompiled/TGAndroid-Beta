package defpackage;
public final class v06 {
    public static final v06 a;
    public static final v06 b;
    public static final v06 c;
    public static final v06 d;
    public static final v06 e;
    public static final v06[] f;

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
        f = new v06[]{r0, r1, r3, r5, r7};
    }

    public static v06 valueOf(String str) {
        return (v06) Enum.valueOf(v06.class, str);
    }

    public static v06[] values() {
        return (v06[]) f.clone();
    }
}
