package k1;
public final class y extends wc.c {
    public d0 f9604a;
    public Object f9605b;
    public final d0 f9606c;
    public int d;

    public y(d0 d0Var, wc.c cVar) {
        super(cVar);
        this.f9606c = d0Var;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f9605b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.f9606c.e(this);
    }
}
