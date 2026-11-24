package defpackage;
public final class rm4 extends qx2 {
    public sm4 a;
    public Object b;
    public final sm4 c;
    public int d;

    public rm4(sm4 sm4Var, px2 px2Var) {
        super(px2Var);
        this.c = sm4Var;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.c(null, this);
    }
}
