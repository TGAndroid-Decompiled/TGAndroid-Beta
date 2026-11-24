package defpackage;
public final class cj8 {
    public static final cj8 a;
    public static final cj8 b;
    public static final cj8 c;
    public static final cj8[] d;

    static {
        ?? r0 = new Enum("DEFAULT", 0);
        a = r0;
        ?? r1 = new Enum("VERY_LOW", 1);
        b = r1;
        ?? r3 = new Enum("HIGHEST", 2);
        c = r3;
        d = new cj8[]{r0, r1, r3};
    }

    public static cj8 valueOf(String str) {
        return (cj8) Enum.valueOf(cj8.class, str);
    }

    public static cj8[] values() {
        return (cj8[]) d.clone();
    }
}
