package m1;
public final class g0 extends kd.c {
    public i0 f19383a;
    public d0 f19384b;
    public boolean f19385c;
    public Object d;
    public final i0 f19386e;
    public int f19387f;

    public g0(i0 i0Var, kd.c cVar) {
        super(cVar);
        this.f19386e = i0Var;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.f19387f |= Integer.MIN_VALUE;
        return this.f19386e.a(null, this);
    }
}
