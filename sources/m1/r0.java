package m1;
public final class r0 extends kd.c {
    public Object f19455a;
    public Object f19456b;
    public Object f19457c;
    public Object d;
    public final t0 f19458e;
    public int f19459f;

    public r0(t0 t0Var, kd.c cVar) {
        super(cVar);
        this.f19458e = t0Var;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.f19459f |= Integer.MIN_VALUE;
        return this.f19458e.c(null, this);
    }
}
