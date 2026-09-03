package k7;
public final class c {
    public static final c f9752a;
    public static final c[] f9753b;

    static {
        ?? r02 = new Enum("DEFAULT", 0);
        f9752a = r02;
        f9753b = new c[]{r02, new Enum("SIGNED", 1), new Enum("FIXED", 2)};
    }

    public static c[] values() {
        return (c[]) f9753b.clone();
    }
}
