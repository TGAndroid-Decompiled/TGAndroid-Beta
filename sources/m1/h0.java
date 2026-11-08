package m1;
public final class h0 extends kd.c {
    public i0 f19387a;
    public Object f19388b;
    public Object f19389c;
    public k0 d;
    public Object f19390e;
    public final i0 f19391f;
    public int h;

    public h0(i0 i0Var, kd.c cVar) {
        super(cVar);
        this.f19391f = i0Var;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f19390e = obj;
        this.h |= Integer.MIN_VALUE;
        return this.f19391f.b(null, this);
    }
}
