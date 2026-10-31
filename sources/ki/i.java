package ki;
public final class i {
    public static final i f11406a;
    public static final i f11407b;
    public static final i[] f11408c;

    static {
        ?? r02 = new Enum("DISABLED", 0);
        f11406a = r02;
        ?? r12 = new Enum("RNNOISE", 1);
        f11407b = r12;
        f11408c = new i[]{r02, r12};
    }

    public static i valueOf(String str) {
        return (i) Enum.valueOf(i.class, str);
    }

    public static i[] values() {
        return (i[]) f11408c.clone();
    }
}
