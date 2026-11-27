package defpackage;
public final class cn4 extends ax2 {
    public xm4 a;
    public Object b;
    public int c;
    public final xm4 d;
    public Object e;

    public cn4(xm4 xm4Var, zw2 zw2Var) {
        super(zw2Var);
        this.d = xm4Var;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.c |= Integer.MIN_VALUE;
        return this.d.c(null, this);
    }
}
