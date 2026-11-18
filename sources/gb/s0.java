package gb;
public final class s0 extends kd.c {
    public Object f13407a;
    public final t0 f13408b;
    public int f13409c;

    public s0(t0 t0Var, kd.c cVar) {
        super(cVar);
        this.f13408b = t0Var;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f13407a = obj;
        this.f13409c |= Integer.MIN_VALUE;
        return t0.a(this.f13408b, this);
    }
}
