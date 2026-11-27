package defpackage;
public enum r44 {
    L(1),
    M(0),
    Q(3),
    H(2);
    
    public static final r44[] e;
    public final byte a;

    static {
        r44 r44Var;
        r44 r44Var2 = L;
        e = new r44[]{M, r44Var2, H, r44Var};
    }

    r44(int i) {
        this.a = i;
    }
}
