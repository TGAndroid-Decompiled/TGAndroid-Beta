package k1;
public final class q extends ld.c {
    public Object f14358a;
    public a0 f14359b;
    public ae.t f14360c;
    public Object d;
    public final a0 f14361e;
    public int f14362f;

    public q(a0 a0Var, ld.c cVar) {
        super(cVar);
        this.f14361e = a0Var;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.f14362f |= Integer.MIN_VALUE;
        return a0.a(this.f14361e, null, this);
    }
}
