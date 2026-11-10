package m1;
public final class h0 extends kd.c {
    public i0 f19392a;
    public Object f19393b;
    public Object f19394c;
    public k0 d;
    public Object f19395e;
    public final i0 f19396f;
    public int h;

    public h0(i0 i0Var, kd.c cVar) {
        super(cVar);
        this.f19396f = i0Var;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f19395e = obj;
        this.h |= Integer.MIN_VALUE;
        return this.f19396f.b(null, this);
    }
}
