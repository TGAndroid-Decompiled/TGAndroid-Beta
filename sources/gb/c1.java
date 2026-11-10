package gb;
public final class c1 {
    public static final c1 f13644a;
    public static final c1 f13645b;
    public static final c1[] f13646c;

    static {
        ?? r02 = new Enum("GENERAL", 0);
        f13644a = r02;
        ?? r12 = new Enum("FALLBACK", 1);
        f13645b = r12;
        c1[] c1VarArr = {r02, r12};
        f13646c = c1VarArr;
        c8.j1.a(c1VarArr);
    }

    public static c1 valueOf(String str) {
        return (c1) Enum.valueOf(c1.class, str);
    }

    public static c1[] values() {
        return (c1[]) f13646c.clone();
    }
}
