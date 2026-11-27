package defpackage;
public final class rbd {
    public static final rbd a;
    public static final rbd[] b;

    static {
        ?? r0 = new Enum("DEFAULT", 0);
        a = r0;
        b = new rbd[]{r0, new Enum("SIGNED", 1), new Enum("FIXED", 2)};
    }

    public static rbd[] values() {
        return (rbd[]) b.clone();
    }
}
