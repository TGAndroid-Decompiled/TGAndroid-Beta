package defpackage;
public final class tm4 extends qx2 {
    public um4 a;
    public Object b;
    public Object c;
    public final um4 d;
    public int e;

    public tm4(um4 um4Var, px2 px2Var) {
        super(px2Var);
        this.d = um4Var;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.e |= Integer.MIN_VALUE;
        return this.d.c(null, this);
    }
}
