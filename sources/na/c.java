package na;
public final class c {
    public static final c f18742a;
    public static final c[] f18743b;

    static {
        ?? r02 = new Enum("DEFAULT", 0);
        f18742a = r02;
        f18743b = new c[]{r02, new Enum("SIGNED", 1), new Enum("FIXED", 2)};
    }

    public static c valueOf(String str) {
        return (c) Enum.valueOf(c.class, str);
    }

    public static c[] values() {
        return (c[]) f18743b.clone();
    }
}
