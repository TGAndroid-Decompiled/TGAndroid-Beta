package gd;

import c8.n1;
public final class d {
    public static final d[] f13505a;

    static {
        d[] dVarArr = {new Enum("SYNCHRONIZED", 0), new Enum("PUBLICATION", 1), new Enum("NONE", 2)};
        f13505a = dVarArr;
        n1.a(dVarArr);
    }

    public static d valueOf(String str) {
        return (d) Enum.valueOf(d.class, str);
    }

    public static d[] values() {
        return (d[]) f13505a.clone();
    }
}
