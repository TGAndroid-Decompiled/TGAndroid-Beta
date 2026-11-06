package m1;
public final class h0 extends kd.c {
    public i0 f19384a;
    public Object f19385b;
    public Object f19386c;
    public k0 d;
    public Object f19387e;
    public final i0 f19388f;
    public int h;

    public h0(i0 i0Var, kd.c cVar) {
        super(cVar);
        this.f19388f = i0Var;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f19387e = obj;
        this.h |= Integer.MIN_VALUE;
        return this.f19388f.b(null, this);
    }
}
