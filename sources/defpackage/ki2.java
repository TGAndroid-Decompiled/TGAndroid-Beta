package defpackage;
public final class ki2 {
    public static final ki2 a;
    public static final ki2[] b;
    ki2 EF0;

    static {
        Enum r0 = new Enum("UNKNOWN", 0);
        ?? r1 = new Enum("ANDROID_FIREBASE", 1);
        a = r1;
        b = new ki2[]{r0, r1};
    }

    public static ki2 valueOf(String str) {
        return (ki2) Enum.valueOf(ki2.class, str);
    }

    public static ki2[] values() {
        return (ki2[]) b.clone();
    }
}
