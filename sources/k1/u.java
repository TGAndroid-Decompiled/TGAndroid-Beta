package k1;
public final class u extends uc.c {
    public a0 f13304a;
    public Object f13305b;
    public final a0 f13306c;
    public int d;

    public u(a0 a0Var, uc.c cVar) {
        super(cVar);
        this.f13306c = a0Var;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f13305b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.f13306c.e(this);
    }
}
