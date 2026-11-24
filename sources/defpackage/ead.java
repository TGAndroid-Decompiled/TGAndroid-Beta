package defpackage;
public final class ead {
    public static final ead a;
    public static final ead[] b;

    static {
        ?? r0 = new Enum("DEFAULT", 0);
        a = r0;
        b = new ead[]{r0, new Enum("SIGNED", 1), new Enum("FIXED", 2)};
    }

    public static ead[] values() {
        return (ead[]) b.clone();
    }
}
