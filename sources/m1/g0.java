package m1;
public final class g0 extends kd.c {
    public i0 f20367a;
    public d0 f20368b;
    public boolean f20369c;
    public Object d;
    public final i0 f20370e;
    public int f20371f;

    public g0(i0 i0Var, kd.c cVar) {
        super(cVar);
        this.f20370e = i0Var;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.f20371f |= Integer.MIN_VALUE;
        return this.f20370e.a(null, this);
    }
}
