package defpackage;
public enum g54 {
    L(1),
    M(0),
    Q(3),
    H(2);
    
    public static final g54[] e;
    public final byte a;

    static {
        g54 g54Var;
        g54 g54Var2 = L;
        e = new g54[]{M, g54Var2, H, g54Var};
    }

    g54(int i) {
        this.a = i;
    }
}
