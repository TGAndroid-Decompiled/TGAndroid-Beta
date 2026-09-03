package k1;
public final class x extends wc.c {
    public d0 f9601a;
    public Object f9602b;
    public final d0 f9603c;
    public int d;

    public x(d0 d0Var, wc.c cVar) {
        super(cVar);
        this.f9603c = d0Var;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f9602b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.f9603c.d(this);
    }
}
