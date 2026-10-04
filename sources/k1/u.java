package k1;
public final class u extends kd.c {
    public a0 f14343a;
    public Object f14344b;
    public final a0 f14345c;
    public int d;

    public u(a0 a0Var, kd.c cVar) {
        super(cVar);
        this.f14345c = a0Var;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f14344b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.f14345c.d(this);
    }
}
