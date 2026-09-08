package k1;
public final class q extends kd.c {
    public Object f14492a;
    public a0 f14493b;
    public zd.t f14494c;
    public Object d;
    public final a0 f14495e;
    public int f14496f;

    public q(a0 a0Var, kd.c cVar) {
        super(cVar);
        this.f14495e = a0Var;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.f14496f |= Integer.MIN_VALUE;
        return a0.a(this.f14495e, null, this);
    }
}
