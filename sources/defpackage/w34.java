package defpackage;
public enum w34 {
    L(1),
    M(0),
    Q(3),
    H(2);
    
    public static final w34[] e;
    public final byte a;

    static {
        w34 w34Var;
        w34 w34Var2 = L;
        e = new w34[]{M, w34Var2, H, w34Var};
    }

    w34(int i) {
        this.a = i;
    }
}
