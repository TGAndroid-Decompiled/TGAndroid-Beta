package n5;
public final class x {
    public static final x f20480a;
    public static final x[] f20481b;
    x EF0;

    static {
        Enum r02 = new Enum("UNKNOWN", 0);
        ?? r12 = new Enum("ANDROID_FIREBASE", 1);
        f20480a = r12;
        f20481b = new x[]{r02, r12};
    }

    public static x valueOf(String str) {
        return (x) Enum.valueOf(x.class, str);
    }

    public static x[] values() {
        return (x[]) f20481b.clone();
    }
}
