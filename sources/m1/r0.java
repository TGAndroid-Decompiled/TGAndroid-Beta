package m1;
public final class r0 extends kd.c {
    public Object f20049a;
    public Object f20050b;
    public Object f20051c;
    public Object d;
    public final t0 f20052e;
    public int f20053f;

    public r0(t0 t0Var, kd.c cVar) {
        super(cVar);
        this.f20052e = t0Var;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.f20053f |= Integer.MIN_VALUE;
        return this.f20052e.c(null, this);
    }
}
