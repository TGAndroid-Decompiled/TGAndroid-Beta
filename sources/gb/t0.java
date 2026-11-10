package gb;
public final class t0 extends kd.c {
    public Object f13757a;
    public final u0 f13758b;
    public int f13759c;

    public t0(u0 u0Var, kd.c cVar) {
        super(cVar);
        this.f13758b = u0Var;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f13757a = obj;
        this.f13759c |= Integer.MIN_VALUE;
        return u0.a(this.f13758b, this);
    }
}
