package na;
public final class c {
    public static final c f18743a;
    public static final c[] f18744b;

    static {
        ?? r02 = new Enum("DEFAULT", 0);
        f18743a = r02;
        f18744b = new c[]{r02, new Enum("SIGNED", 1), new Enum("FIXED", 2)};
    }

    public static c valueOf(String str) {
        return (c) Enum.valueOf(c.class, str);
    }

    public static c[] values() {
        return (c[]) f18744b.clone();
    }
}
