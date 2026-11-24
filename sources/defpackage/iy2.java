package defpackage;
public final class iy2 {
    public static final iy2 a;
    public static final iy2 b;
    public static final iy2 c;
    public static final iy2 d;
    public static final iy2 e;
    public static final iy2[] f;

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
        f = new iy2[]{r0, r1, r3, r5, r7};
    }

    public static iy2 valueOf(String str) {
        return (iy2) Enum.valueOf(iy2.class, str);
    }

    public static iy2[] values() {
        return (iy2[]) f.clone();
    }
}
