package m1;
public final class h0 extends kd.c {
    public i0 f20342a;
    public Object f20343b;
    public Object f20344c;
    public k0 d;
    public Object f20345e;
    public final i0 f20346f;
    public int h;

    public h0(i0 i0Var, kd.c cVar) {
        super(cVar);
        this.f20346f = i0Var;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f20345e = obj;
        this.h |= Integer.MIN_VALUE;
        return this.f20346f.b(null, this);
    }
}
