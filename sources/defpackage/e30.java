package defpackage;
public final class e30 {
    public static final e30 a;
    public static final e30 b;
    public static final e30[] c;

    static {
        ?? r0 = new Enum("DISABLED", 0);
        a = r0;
        ?? r1 = new Enum("RNNOISE", 1);
        b = r1;
        c = new e30[]{r0, r1};
    }

    public static e30 valueOf(String str) {
        return (e30) Enum.valueOf(e30.class, str);
    }

    public static e30[] values() {
        return (e30[]) c.clone();
    }
}
