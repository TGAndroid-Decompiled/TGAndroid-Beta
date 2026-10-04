package k1;
public final class u extends kd.c {
    public a0 f14344a;
    public Object f14345b;
    public final a0 f14346c;
    public int d;

    public u(a0 a0Var, kd.c cVar) {
        super(cVar);
        this.f14346c = a0Var;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f14345b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.f14346c.d(this);
    }
}
