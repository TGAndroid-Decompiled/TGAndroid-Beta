package defpackage;
public final class pm8 {
    public static final pm8 a;
    public static final pm8 b;
    public static final pm8 c;
    public static final pm8[] d;

    static {
        ?? r0 = new Enum("DEFAULT", 0);
        a = r0;
        ?? r1 = new Enum("VERY_LOW", 1);
        b = r1;
        ?? r3 = new Enum("HIGHEST", 2);
        c = r3;
        d = new pm8[]{r0, r1, r3};
    }

    public static pm8 valueOf(String str) {
        return (pm8) Enum.valueOf(pm8.class, str);
    }

    public static pm8[] values() {
        return (pm8[]) d.clone();
    }
}
