package k1;
public final class q extends kd.c {
    public Object f14466a;
    public a0 f14467b;
    public zd.t f14468c;
    public Object d;
    public final a0 f14469e;
    public int f14470f;

    public q(a0 a0Var, kd.c cVar) {
        super(cVar);
        this.f14469e = a0Var;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.f14470f |= Integer.MIN_VALUE;
        return a0.a(this.f14469e, null, this);
    }
}
