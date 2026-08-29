package i7;
public final class c {
    public static final c f8275a;
    public static final c[] f8276b;

    static {
        ?? r02 = new Enum("DEFAULT", 0);
        f8275a = r02;
        f8276b = new c[]{r02, new Enum("SIGNED", 1), new Enum("FIXED", 2)};
    }

    public static c[] values() {
        return (c[]) f8276b.clone();
    }
}
