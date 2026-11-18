package m1;
public final class r0 extends kd.c {
    public Object f20413a;
    public Object f20414b;
    public Object f20415c;
    public Object d;
    public final t0 f20416e;
    public int f20417f;

    public r0(t0 t0Var, kd.c cVar) {
        super(cVar);
        this.f20416e = t0Var;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.f20417f |= Integer.MIN_VALUE;
        return this.f20416e.c(null, this);
    }
}
