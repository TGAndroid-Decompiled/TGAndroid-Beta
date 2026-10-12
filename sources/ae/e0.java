package ae;
public final class e0 {
    public static final e0 f440a;
    public static final e0[] f441b;

    static {
        ?? r02 = new Enum("DEFAULT", 0);
        f440a = r02;
        e0[] e0VarArr = {r02, new Enum("LAZY", 1), new Enum("ATOMIC", 2), new Enum("UNDISPATCHED", 3)};
        f441b = e0VarArr;
        w7.u.a(e0VarArr);
    }

    public static e0 valueOf(String str) {
        return (e0) Enum.valueOf(e0.class, str);
    }

    public static e0[] values() {
        return (e0[]) f441b.clone();
    }
}
