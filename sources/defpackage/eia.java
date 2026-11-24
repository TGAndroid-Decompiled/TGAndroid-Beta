package defpackage;
public final class eia {
    public static final eia a;
    public static final eia b;
    public static final eia[] c;

    static {
        ?? r0 = new Enum("GENERAL", 0);
        a = r0;
        ?? r1 = new Enum("FALLBACK", 1);
        b = r1;
        c = new eia[]{r0, r1};
    }

    public static eia valueOf(String str) {
        return (eia) Enum.valueOf(eia.class, str);
    }

    public static eia[] values() {
        return (eia[]) c.clone();
    }
}
