package defpackage;
public final class on9 {
    public static final on9 a;
    public static final on9 b;
    public static final on9 c;
    public static final on9[] d;

    static {
        ?? r0 = new Enum("HIGH", 0);
        a = r0;
        ?? r1 = new Enum("MEDIUM", 1);
        b = r1;
        ?? r3 = new Enum("LOW", 2);
        c = r3;
        d = new on9[]{r0, r1, r3};
    }

    public static on9 valueOf(String str) {
        return (on9) Enum.valueOf(on9.class, str);
    }

    public static on9[] values() {
        return (on9[]) d.clone();
    }
}
