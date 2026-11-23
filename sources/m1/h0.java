package m1;
public final class h0 extends kd.c {
    public i0 f20376a;
    public Object f20377b;
    public Object f20378c;
    public k0 d;
    public Object f20379e;
    public final i0 f20380f;
    public int h;

    public h0(i0 i0Var, kd.c cVar) {
        super(cVar);
        this.f20380f = i0Var;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f20379e = obj;
        this.h |= Integer.MIN_VALUE;
        return this.f20380f.b(null, this);
    }
}
