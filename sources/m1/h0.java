package m1;
public final class h0 extends kd.c {
    public i0 f20438a;
    public Object f20439b;
    public Object f20440c;
    public k0 d;
    public Object f20441e;
    public final i0 f20442f;
    public int h;

    public h0(i0 i0Var, kd.c cVar) {
        super(cVar);
        this.f20442f = i0Var;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f20441e = obj;
        this.h |= Integer.MIN_VALUE;
        return this.f20442f.b(null, this);
    }
}
