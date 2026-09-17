package k1;
public final class y extends kd.c {
    public a0 f14527a;
    public Object f14528b;
    public Object f14529c;
    public Object d;
    public final a0 f14530e;
    public int f14531f;

    public y(a0 a0Var, kd.c cVar) {
        super(cVar);
        this.f14530e = a0Var;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.f14531f |= Integer.MIN_VALUE;
        return this.f14530e.i(null, null, this);
    }
}
