package defpackage;
public final class yw2 {
    public static final yw2 a;
    public static final yw2 b;
    public static final yw2 c;
    public static final yw2 d;
    public static final yw2 e;
    public static final yw2[] f;

    static {
        ?? r0 = new Enum("CPU_ACQUIRED", 0);
        a = r0;
        ?? r1 = new Enum("BLOCKING", 1);
        b = r1;
        ?? r3 = new Enum("PARKING", 2);
        c = r3;
        ?? r5 = new Enum("DORMANT", 3);
        d = r5;
        ?? r7 = new Enum("TERMINATED", 4);
        e = r7;
        f = new yw2[]{r0, r1, r3, r5, r7};
    }

    public static yw2 valueOf(String str) {
        return (yw2) Enum.valueOf(yw2.class, str);
    }

    public static yw2[] values() {
        return (yw2[]) f.clone();
    }
}
