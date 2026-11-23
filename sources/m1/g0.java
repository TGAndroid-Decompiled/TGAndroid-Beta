package m1;
public final class g0 extends kd.c {
    public i0 f20333a;
    public d0 f20334b;
    public boolean f20335c;
    public Object d;
    public final i0 f20336e;
    public int f20337f;

    public g0(i0 i0Var, kd.c cVar) {
        super(cVar);
        this.f20336e = i0Var;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.f20337f |= Integer.MIN_VALUE;
        return this.f20336e.a(null, this);
    }
}
