package defpackage;
public final class lla {
    public static final lla a;
    public static final lla b;
    public static final lla[] c;

    static {
        ?? r0 = new Enum("ICON", 0);
        a = r0;
        ?? r1 = new Enum("TEXT", 1);
        b = r1;
        c = new lla[]{r0, r1};
    }

    public static lla valueOf(String str) {
        return (lla) Enum.valueOf(lla.class, str);
    }

    public static lla[] values() {
        return (lla[]) c.clone();
    }
}
