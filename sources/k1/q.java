package k1;
public final class q extends kd.c {
    public Object f14322a;
    public a0 f14323b;
    public zd.t f14324c;
    public Object d;
    public final a0 f14325e;
    public int f14326f;

    public q(a0 a0Var, kd.c cVar) {
        super(cVar);
        this.f14325e = a0Var;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.f14326f |= Integer.MIN_VALUE;
        return a0.a(this.f14325e, null, this);
    }
}
