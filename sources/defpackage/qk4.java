package defpackage;
public final class qk4 extends gw2 {
    public rk4 a;
    public Object b;
    public final rk4 c;
    public int d;

    public qk4(rk4 rk4Var, fw2 fw2Var) {
        super(fw2Var);
        this.c = rk4Var;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.c(null, this);
    }
}
