package k1;
public final class x extends wc.c {
    public d0 f10328a;
    public Object f10329b;
    public final d0 f10330c;
    public int d;

    public x(d0 d0Var, wc.c cVar) {
        super(cVar);
        this.f10330c = d0Var;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f10329b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.f10330c.e(this);
    }
}
