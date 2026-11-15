package m1;
public final class h0 extends kd.c {
    public i0 f19981a;
    public Object f19982b;
    public Object f19983c;
    public k0 d;
    public Object f19984e;
    public final i0 f19985f;
    public int h;

    public h0(i0 i0Var, kd.c cVar) {
        super(cVar);
        this.f19985f = i0Var;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f19984e = obj;
        this.h |= Integer.MIN_VALUE;
        return this.f19985f.b(null, this);
    }
}
