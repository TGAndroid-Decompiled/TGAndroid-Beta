package k1;
public final class v extends ld.c {
    public a0 f14382a;
    public Object f14383b;
    public final a0 f14384c;
    public int d;

    public v(a0 a0Var, ld.c cVar) {
        super(cVar);
        this.f14384c = a0Var;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f14383b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.f14384c.f(this);
    }
}
