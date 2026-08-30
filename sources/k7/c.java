package k7;
public final class c {
    public static final c f9772a;
    public static final c[] f9773b;

    static {
        ?? r02 = new Enum("DEFAULT", 0);
        f9772a = r02;
        f9773b = new c[]{r02, new Enum("SIGNED", 1), new Enum("FIXED", 2)};
    }

    public static c[] values() {
        return (c[]) f9773b.clone();
    }
}
