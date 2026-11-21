package m1;
public final class g0 extends kd.c {
    public i0 f20364a;
    public d0 f20365b;
    public boolean f20366c;
    public Object d;
    public final i0 f20367e;
    public int f20368f;

    public g0(i0 i0Var, kd.c cVar) {
        super(cVar);
        this.f20367e = i0Var;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.f20368f |= Integer.MIN_VALUE;
        return this.f20367e.a(null, this);
    }
}
