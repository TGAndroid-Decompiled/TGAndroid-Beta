package k1;
public final class u extends kd.c {
    public a0 f14513a;
    public Object f14514b;
    public final a0 f14515c;
    public int d;

    public u(a0 a0Var, kd.c cVar) {
        super(cVar);
        this.f14515c = a0Var;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f14514b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.f14515c.d(this);
    }
}
