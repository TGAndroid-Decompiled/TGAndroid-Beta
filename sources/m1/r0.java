package m1;
public final class r0 extends kd.c {
    public Object f19452a;
    public Object f19453b;
    public Object f19454c;
    public Object d;
    public final t0 f19455e;
    public int f19456f;

    public r0(t0 t0Var, kd.c cVar) {
        super(cVar);
        this.f19455e = t0Var;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.f19456f |= Integer.MIN_VALUE;
        return this.f19455e.c(null, this);
    }
}
