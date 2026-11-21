package m1;
public final class h0 extends kd.c {
    public i0 f20373a;
    public Object f20374b;
    public Object f20375c;
    public k0 d;
    public Object f20376e;
    public final i0 f20377f;
    public int h;

    public h0(i0 i0Var, kd.c cVar) {
        super(cVar);
        this.f20377f = i0Var;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f20376e = obj;
        this.h |= Integer.MIN_VALUE;
        return this.f20377f.b(null, this);
    }
}
