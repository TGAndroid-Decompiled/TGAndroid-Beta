package k5;
public final class p {
    public static final p f14153a;
    public static final p[] f14154b;
    p EF0;

    static {
        Enum r02 = new Enum("UNKNOWN", 0);
        ?? r12 = new Enum("ANDROID_FIREBASE", 1);
        f14153a = r12;
        f14154b = new p[]{r02, r12};
    }

    public static p valueOf(String str) {
        return (p) Enum.valueOf(p.class, str);
    }

    public static p[] values() {
        return (p[]) f14154b.clone();
    }
}
