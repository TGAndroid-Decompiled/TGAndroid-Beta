package ai;
public final class v5 {
    public static final v5 f1043a;
    public static final v5 f1044b;
    public static final v5 f1045c;
    public static final v5[] d;

    static {
        ?? r02 = new Enum("BY_PRICE", 0);
        f1043a = r02;
        ?? r12 = new Enum("BY_DATE", 1);
        f1044b = r12;
        ?? r32 = new Enum("BY_NUMBER", 2);
        f1045c = r32;
        d = new v5[]{r02, r12, r32};
    }

    public static v5 valueOf(String str) {
        return (v5) Enum.valueOf(v5.class, str);
    }

    public static v5[] values() {
        return (v5[]) d.clone();
    }
}
