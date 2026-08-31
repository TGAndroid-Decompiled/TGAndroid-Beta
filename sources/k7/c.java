package k7;
public final class c {
    public static final c f10495a;
    public static final c[] f10496b;

    static {
        ?? r02 = new Enum("DEFAULT", 0);
        f10495a = r02;
        f10496b = new c[]{r02, new Enum("SIGNED", 1), new Enum("FIXED", 2)};
    }

    public static c[] values() {
        return (c[]) f10496b.clone();
    }
}
