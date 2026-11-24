package defpackage;
public final class xk4 extends gw2 {
    public rk4 a;
    public Object b;
    public int c;
    public final rk4 d;
    public Object e;

    public xk4(rk4 rk4Var, fw2 fw2Var) {
        super(fw2Var);
        this.d = rk4Var;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.c |= Integer.MIN_VALUE;
        return this.d.c(null, this);
    }
}
