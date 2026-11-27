package defpackage;
public final class sm4 extends ax2 {
    public Object a;
    public int b;
    public final qx6 c;
    public qx6 d;
    public nm4 e;
    public gs9 f;

    public sm4(qx6 qx6Var, zw2 zw2Var) {
        super(zw2Var);
        this.c = qx6Var;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.b |= Integer.MIN_VALUE;
        return this.c.k(null, this);
    }
}
