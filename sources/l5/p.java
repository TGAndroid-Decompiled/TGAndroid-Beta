package l5;
public final class p {
    public static final p f16913a;
    public static final p[] f16914b;
    p EF0;

    static {
        Enum r02 = new Enum("UNKNOWN", 0);
        ?? r12 = new Enum("ANDROID_FIREBASE", 1);
        f16913a = r12;
        f16914b = new p[]{r02, r12};
    }

    public static p valueOf(String str) {
        return (p) Enum.valueOf(p.class, str);
    }

    public static p[] values() {
        return (p[]) f16914b.clone();
    }
}
