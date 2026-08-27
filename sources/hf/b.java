package hf;

public final class b {

    public static final b f8921a;

    public static final b f8922b;

    public static final b[] f8923c;

    static {
        b bVar = new b("STARS", 0);
        f8921a = bVar;
        b bVar2 = new b("TON", 1);
        f8922b = bVar2;
        f8923c = new b[]{bVar, bVar2};
    }

    public static b valueOf(String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    public static b[] values() {
        return (b[]) f8923c.clone();
    }
}
