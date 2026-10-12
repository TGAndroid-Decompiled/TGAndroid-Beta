package k1;
public final class u extends ld.c {
    public a0 f14377a;
    public Object f14378b;
    public final a0 f14379c;
    public int d;

    public u(a0 a0Var, ld.c cVar) {
        super(cVar);
        this.f14379c = a0Var;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f14378b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.f14379c.e(this);
    }
}
