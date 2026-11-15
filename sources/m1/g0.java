package m1;
public final class g0 extends kd.c {
    public i0 f19972a;
    public d0 f19973b;
    public boolean f19974c;
    public Object d;
    public final i0 f19975e;
    public int f19976f;

    public g0(i0 i0Var, kd.c cVar) {
        super(cVar);
        this.f19975e = i0Var;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.f19976f |= Integer.MIN_VALUE;
        return this.f19975e.a(null, this);
    }
}
