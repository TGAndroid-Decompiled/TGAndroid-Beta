package m1;
public final class r0 extends kd.c {
    public Object f20416a;
    public Object f20417b;
    public Object f20418c;
    public Object d;
    public final t0 f20419e;
    public int f20420f;

    public r0(t0 t0Var, kd.c cVar) {
        super(cVar);
        this.f20419e = t0Var;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.f20420f |= Integer.MIN_VALUE;
        return this.f20419e.c(null, this);
    }
}
