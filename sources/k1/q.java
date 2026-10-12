package k1;
public final class q extends ld.c {
    public Object f14356a;
    public a0 f14357b;
    public ae.t f14358c;
    public Object d;
    public final a0 f14359e;
    public int f14360f;

    public q(a0 a0Var, ld.c cVar) {
        super(cVar);
        this.f14359e = a0Var;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.f14360f |= Integer.MIN_VALUE;
        return a0.a(this.f14359e, null, this);
    }
}
