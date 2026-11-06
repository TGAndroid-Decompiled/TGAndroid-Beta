package gb;
public final class t0 extends kd.c {
    public Object f13755a;
    public final u0 f13756b;
    public int f13757c;

    public t0(u0 u0Var, kd.c cVar) {
        super(cVar);
        this.f13756b = u0Var;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f13755a = obj;
        this.f13757c |= Integer.MIN_VALUE;
        return u0.a(this.f13756b, this);
    }
}
