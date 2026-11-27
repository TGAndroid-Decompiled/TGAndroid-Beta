package defpackage;
public final class gj2 {
    public static final gj2 a;
    public static final gj2[] b;
    gj2 EF0;

    static {
        Enum r0 = new Enum("UNKNOWN", 0);
        ?? r1 = new Enum("ANDROID_FIREBASE", 1);
        a = r1;
        b = new gj2[]{r0, r1};
    }

    public static gj2 valueOf(String str) {
        return (gj2) Enum.valueOf(gj2.class, str);
    }

    public static gj2[] values() {
        return (gj2[]) b.clone();
    }
}
