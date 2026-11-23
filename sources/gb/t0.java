package gb;
public final class t0 extends kd.c {
    public Object f13406a;
    public final u0 f13407b;
    public int f13408c;

    public t0(u0 u0Var, kd.c cVar) {
        super(cVar);
        this.f13407b = u0Var;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f13406a = obj;
        this.f13408c |= Integer.MIN_VALUE;
        return u0.a(this.f13407b, this);
    }
}
