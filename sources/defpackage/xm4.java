package defpackage;
public final class xm4 extends qx2 {
    public sm4 a;
    public Object b;
    public int c;
    public final sm4 d;
    public Object e;

    public xm4(sm4 sm4Var, px2 px2Var) {
        super(px2Var);
        this.d = sm4Var;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.c |= Integer.MIN_VALUE;
        return this.d.c(null, this);
    }
}
