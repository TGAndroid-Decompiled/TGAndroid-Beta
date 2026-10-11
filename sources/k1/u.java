package k1;
public final class u extends ld.c {
    public a0 f14379a;
    public Object f14380b;
    public final a0 f14381c;
    public int d;

    public u(a0 a0Var, ld.c cVar) {
        super(cVar);
        this.f14381c = a0Var;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f14380b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.f14381c.e(this);
    }
}
