package defpackage;
public final class yj2 {
    public static final yj2 a;
    public static final yj2[] b;
    yj2 EF0;

    static {
        Enum r0 = new Enum("UNKNOWN", 0);
        ?? r1 = new Enum("ANDROID_FIREBASE", 1);
        a = r1;
        b = new yj2[]{r0, r1};
    }

    public static yj2 valueOf(String str) {
        return (yj2) Enum.valueOf(yj2.class, str);
    }

    public static yj2[] values() {
        return (yj2[]) b.clone();
    }
}
