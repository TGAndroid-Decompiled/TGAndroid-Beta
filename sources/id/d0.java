package id;

import h7.s7;

public final class d0 {

    public static final d0 f11128a;

    public static final d0[] f11129b;

    static {
        d0 d0Var = new d0("DEFAULT", 0);
        f11128a = d0Var;
        d0[] d0VarArr = {d0Var, new d0("LAZY", 1), new d0("ATOMIC", 2), new d0("UNDISPATCHED", 3)};
        f11129b = d0VarArr;
        s7.a(d0VarArr);
    }

    public static d0 valueOf(String str) {
        return (d0) Enum.valueOf(d0.class, str);
    }

    public static d0[] values() {
        return (d0[]) f11129b.clone();
    }
}
