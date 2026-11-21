package gb;
public final class s0 extends kd.c {
    public Object f13436a;
    public final t0 f13437b;
    public int f13438c;

    public s0(t0 t0Var, kd.c cVar) {
        super(cVar);
        this.f13437b = t0Var;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f13436a = obj;
        this.f13438c |= Integer.MIN_VALUE;
        return t0.a(this.f13437b, this);
    }
}
