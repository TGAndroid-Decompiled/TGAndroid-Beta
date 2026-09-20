package k1;
public final class q extends kd.c {
    public Object f13186a;
    public a0 f13187b;
    public zd.t f13188c;
    public Object d;
    public final a0 e;
    public int f13189f;

    public q(a0 a0Var, kd.c cVar) {
        super(cVar);
        this.e = a0Var;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.f13189f |= Integer.MIN_VALUE;
        return a0.b(this.e, null, this);
    }
}
