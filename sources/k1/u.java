package k1;
public final class u extends ld.c {
    public a0 f14380a;
    public Object f14381b;
    public final a0 f14382c;
    public int d;

    public u(a0 a0Var, ld.c cVar) {
        super(cVar);
        this.f14382c = a0Var;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f14381b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.f14382c.e(this);
    }
}
