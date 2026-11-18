package m1;
public final class g0 extends kd.c {
    public i0 f20336a;
    public d0 f20337b;
    public boolean f20338c;
    public Object d;
    public final i0 f20339e;
    public int f20340f;

    public g0(i0 i0Var, kd.c cVar) {
        super(cVar);
        this.f20339e = i0Var;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.f20340f |= Integer.MIN_VALUE;
        return this.f20339e.a(null, this);
    }
}
