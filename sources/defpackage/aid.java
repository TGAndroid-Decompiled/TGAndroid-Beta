package defpackage;
public final class aid {
    public static final aid a;
    public static final aid[] b;

    static {
        ?? r0 = new Enum("DEFAULT", 0);
        a = r0;
        b = new aid[]{r0, new Enum("SIGNED", 1), new Enum("FIXED", 2)};
    }

    public static aid[] values() {
        return (aid[]) b.clone();
    }
}
