package defpackage;
public final class ol9 {
    public static final ol9 a;
    public static final ol9 b;
    public static final ol9 c;
    public static final ol9[] d;

    static {
        ?? r0 = new Enum("HIGH", 0);
        a = r0;
        ?? r1 = new Enum("MEDIUM", 1);
        b = r1;
        ?? r3 = new Enum("LOW", 2);
        c = r3;
        d = new ol9[]{r0, r1, r3};
    }

    public static ol9 valueOf(String str) {
        return (ol9) Enum.valueOf(ol9.class, str);
    }

    public static ol9[] values() {
        return (ol9[]) d.clone();
    }
}
