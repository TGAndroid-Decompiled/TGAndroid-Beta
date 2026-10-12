package k1;
public final class u extends ld.c {
    public a0 f14376a;
    public Object f14377b;
    public final a0 f14378c;
    public int d;

    public u(a0 a0Var, ld.c cVar) {
        super(cVar);
        this.f14378c = a0Var;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f14377b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.f14378c.e(this);
    }
}
