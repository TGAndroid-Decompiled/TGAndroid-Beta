package m1;
public final class g0 extends kd.c {
    public i0 f20339a;
    public d0 f20340b;
    public boolean f20341c;
    public Object d;
    public final i0 f20342e;
    public int f20343f;

    public g0(i0 i0Var, kd.c cVar) {
        super(cVar);
        this.f20342e = i0Var;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.f20343f |= Integer.MIN_VALUE;
        return this.f20342e.a(null, this);
    }
}
