package defpackage;
public final class sx2 {
    public static final sx2 a;
    public static final sx2 b;
    public static final sx2 c;
    public static final sx2 d;
    public static final sx2 e;
    public static final sx2[] f;

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
        f = new sx2[]{r0, r1, r3, r5, r7};
    }

    public static sx2 valueOf(String str) {
        return (sx2) Enum.valueOf(sx2.class, str);
    }

    public static sx2[] values() {
        return (sx2[]) f.clone();
    }
}
