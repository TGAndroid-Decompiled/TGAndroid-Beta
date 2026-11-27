package defpackage;
public final class cp9 {
    public static final cp9 a;
    public static final cp9 b;
    public static final cp9[] c;

    static {
        ?? r0 = new Enum("FRONT", 0);
        a = r0;
        ?? r1 = new Enum("BACK", 1);
        b = r1;
        c = new cp9[]{r0, r1};
    }

    public static cp9 valueOf(String str) {
        return (cp9) Enum.valueOf(cp9.class, str);
    }

    public static cp9[] values() {
        return (cp9[]) c.clone();
    }
}
