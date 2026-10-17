package ag;
public final class c {
    public static final c f635a;
    public static final c f636b;
    public static final c[] f637c;

    static {
        ?? r02 = new Enum("STARS", 0);
        f635a = r02;
        ?? r12 = new Enum("TON", 1);
        f636b = r12;
        f637c = new c[]{r02, r12};
    }

    public static c valueOf(String str) {
        return (c) Enum.valueOf(c.class, str);
    }

    public static c[] values() {
        return (c[]) f637c.clone();
    }
}
