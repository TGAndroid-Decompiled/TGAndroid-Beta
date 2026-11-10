package m1;
public final class r0 extends kd.c {
    public Object f19460a;
    public Object f19461b;
    public Object f19462c;
    public Object d;
    public final t0 f19463e;
    public int f19464f;

    public r0(t0 t0Var, kd.c cVar) {
        super(cVar);
        this.f19463e = t0Var;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.f19464f |= Integer.MIN_VALUE;
        return this.f19463e.c(null, this);
    }
}
