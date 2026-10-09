package ae;
public final class e0 {
    public static final e0 f438a;
    public static final e0[] f439b;

    static {
        ?? r02 = new Enum("DEFAULT", 0);
        f438a = r02;
        e0[] e0VarArr = {r02, new Enum("LAZY", 1), new Enum("ATOMIC", 2), new Enum("UNDISPATCHED", 3)};
        f439b = e0VarArr;
        w7.v.a(e0VarArr);
    }

    public static e0 valueOf(String str) {
        return (e0) Enum.valueOf(e0.class, str);
    }

    public static e0[] values() {
        return (e0[]) f439b.clone();
    }
}
