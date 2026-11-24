package defpackage;
public final class fl8 {
    public static final fl8 a;
    public static final fl8 b;
    public static final fl8 c;
    public static final fl8[] d;

    static {
        ?? r0 = new Enum("DEFAULT", 0);
        a = r0;
        ?? r1 = new Enum("VERY_LOW", 1);
        b = r1;
        ?? r3 = new Enum("HIGHEST", 2);
        c = r3;
        d = new fl8[]{r0, r1, r3};
    }

    public static fl8 valueOf(String str) {
        return (fl8) Enum.valueOf(fl8.class, str);
    }

    public static fl8[] values() {
        return (fl8[]) d.clone();
    }
}
