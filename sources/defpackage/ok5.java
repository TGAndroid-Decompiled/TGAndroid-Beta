package defpackage;
public final class ok5 {
    public static final ok5 a;
    public static final ok5 b;
    public static final ok5[] c;

    static {
        ?? r0 = new Enum("BACK", 0);
        a = r0;
        ?? r1 = new Enum("MENU", 1);
        b = r1;
        c = new ok5[]{r0, r1};
    }

    public static ok5 valueOf(String str) {
        return (ok5) Enum.valueOf(ok5.class, str);
    }

    public static ok5[] values() {
        return (ok5[]) c.clone();
    }
}
