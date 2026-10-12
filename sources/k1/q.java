package k1;
public final class q extends ld.c {
    public Object f14355a;
    public a0 f14356b;
    public ae.t f14357c;
    public Object d;
    public final a0 f14358e;
    public int f14359f;

    public q(a0 a0Var, ld.c cVar) {
        super(cVar);
        this.f14358e = a0Var;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.f14359f |= Integer.MIN_VALUE;
        return a0.a(this.f14358e, null, this);
    }
}
