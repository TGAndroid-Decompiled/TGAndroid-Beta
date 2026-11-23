package gb;
public final class s0 extends kd.c {
    public Object f13402a;
    public final t0 f13403b;
    public int f13404c;

    public s0(t0 t0Var, kd.c cVar) {
        super(cVar);
        this.f13403b = t0Var;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f13402a = obj;
        this.f13404c |= Integer.MIN_VALUE;
        return t0.a(this.f13403b, this);
    }
}
