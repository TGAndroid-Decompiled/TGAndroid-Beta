package gb;
public final class s0 extends kd.c {
    public Object f13093a;
    public final t0 f13094b;
    public int f13095c;

    public s0(t0 t0Var, kd.c cVar) {
        super(cVar);
        this.f13094b = t0Var;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f13093a = obj;
        this.f13095c |= Integer.MIN_VALUE;
        return t0.a(this.f13094b, this);
    }
}
