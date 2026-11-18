package gb;
public final class s0 extends kd.c {
    public Object f13410a;
    public final t0 f13411b;
    public int f13412c;

    public s0(t0 t0Var, kd.c cVar) {
        super(cVar);
        this.f13411b = t0Var;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f13410a = obj;
        this.f13412c |= Integer.MIN_VALUE;
        return t0.a(this.f13411b, this);
    }
}
