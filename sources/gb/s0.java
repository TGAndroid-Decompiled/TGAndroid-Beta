package gb;
public final class s0 extends kd.c {
    public Object f13439a;
    public final t0 f13440b;
    public int f13441c;

    public s0(t0 t0Var, kd.c cVar) {
        super(cVar);
        this.f13440b = t0Var;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f13439a = obj;
        this.f13441c |= Integer.MIN_VALUE;
        return t0.a(this.f13440b, this);
    }
}
