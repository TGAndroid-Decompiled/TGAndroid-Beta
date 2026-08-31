package la;
public final class g0 extends wc.c {
    public h0 f12183a;
    public Object f12184b;
    public final h0 f12185c;
    public int d;

    public g0(h0 h0Var, wc.c cVar) {
        super(cVar);
        this.f12185c = h0Var;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f12184b = obj;
        this.d |= Integer.MIN_VALUE;
        return h0.b(this.f12185c, this);
    }
}
