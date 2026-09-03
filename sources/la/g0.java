package la;
public final class g0 extends wc.c {
    public h0 f11881a;
    public Object f11882b;
    public final h0 f11883c;
    public int d;

    public g0(h0 h0Var, wc.c cVar) {
        super(cVar);
        this.f11883c = h0Var;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f11882b = obj;
        this.d |= Integer.MIN_VALUE;
        return h0.b(this.f11883c, this);
    }
}
