package defpackage;
public final class f30 {
    public static final f30 a;
    public static final f30 b;
    public static final f30[] c;

    static {
        ?? r0 = new Enum("DISABLED", 0);
        a = r0;
        ?? r1 = new Enum("RNNOISE", 1);
        b = r1;
        c = new f30[]{r0, r1};
    }

    public static f30 valueOf(String str) {
        return (f30) Enum.valueOf(f30.class, str);
    }

    public static f30[] values() {
        return (f30[]) c.clone();
    }
}
