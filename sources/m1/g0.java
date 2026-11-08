package m1;
public final class g0 extends kd.c {
    public i0 f19378a;
    public d0 f19379b;
    public boolean f19380c;
    public Object d;
    public final i0 f19381e;
    public int f19382f;

    public g0(i0 i0Var, kd.c cVar) {
        super(cVar);
        this.f19381e = i0Var;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.f19382f |= Integer.MIN_VALUE;
        return this.f19381e.a(null, this);
    }
}
