package defpackage;
public final class e40 {
    public static final e40 a;
    public static final e40 b;
    public static final e40[] c;

    static {
        ?? r0 = new Enum("DISABLED", 0);
        a = r0;
        ?? r1 = new Enum("RNNOISE", 1);
        b = r1;
        c = new e40[]{r0, r1};
    }

    public static e40 valueOf(String str) {
        return (e40) Enum.valueOf(e40.class, str);
    }

    public static e40[] values() {
        return (e40[]) c.clone();
    }
}
