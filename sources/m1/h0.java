package m1;
public final class h0 extends kd.c {
    public i0 f20348a;
    public Object f20349b;
    public Object f20350c;
    public k0 d;
    public Object f20351e;
    public final i0 f20352f;
    public int h;

    public h0(i0 i0Var, kd.c cVar) {
        super(cVar);
        this.f20352f = i0Var;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f20351e = obj;
        this.h |= Integer.MIN_VALUE;
        return this.f20352f.b(null, this);
    }
}
