package ki;
public final class i {
    public static final i f11407a;
    public static final i f11408b;
    public static final i[] f11409c;

    static {
        ?? r02 = new Enum("DISABLED", 0);
        f11407a = r02;
        ?? r12 = new Enum("RNNOISE", 1);
        f11408b = r12;
        f11409c = new i[]{r02, r12};
    }

    public static i valueOf(String str) {
        return (i) Enum.valueOf(i.class, str);
    }

    public static i[] values() {
        return (i[]) f11409c.clone();
    }
}
