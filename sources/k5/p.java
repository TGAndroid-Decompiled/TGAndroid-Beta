package k5;
public final class p {
    public static final p f14655a;
    public static final p[] f14656b;
    p EF0;

    static {
        Enum r02 = new Enum("UNKNOWN", 0);
        ?? r12 = new Enum("ANDROID_FIREBASE", 1);
        f14655a = r12;
        f14656b = new p[]{r02, r12};
    }

    public static p valueOf(String str) {
        return (p) Enum.valueOf(p.class, str);
    }

    public static p[] values() {
        return (p[]) f14656b.clone();
    }
}
