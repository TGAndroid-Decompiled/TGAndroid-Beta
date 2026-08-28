package g7;
public final class c {
    public static final c f7137a;
    public static final c[] f7138b;

    static {
        ?? r02 = new Enum("DEFAULT", 0);
        f7137a = r02;
        f7138b = new c[]{r02, new Enum("SIGNED", 1), new Enum("FIXED", 2)};
    }

    public static c[] values() {
        return (c[]) f7138b.clone();
    }
}
