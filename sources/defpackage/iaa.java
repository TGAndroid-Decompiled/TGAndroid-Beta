package defpackage;
public final class iaa {
    public static final iaa a;
    public static final iaa b;
    public static final iaa[] c;

    static {
        ?? r0 = new Enum("CRASHLYTICS", 0);
        a = r0;
        ?? r1 = new Enum("PERFORMANCE", 1);
        b = r1;
        c = new iaa[]{r0, r1, new Enum("MATT_SAYS_HI", 2)};
    }

    public static iaa valueOf(String str) {
        return (iaa) Enum.valueOf(iaa.class, str);
    }

    public static iaa[] values() {
        return (iaa[]) c.clone();
    }
}
