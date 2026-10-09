package k1;
public final class v extends ld.c {
    public a0 f14383a;
    public Object f14384b;
    public final a0 f14385c;
    public int d;

    public v(a0 a0Var, ld.c cVar) {
        super(cVar);
        this.f14385c = a0Var;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f14384b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.f14385c.f(this);
    }
}
