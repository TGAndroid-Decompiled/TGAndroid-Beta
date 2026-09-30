package k1;
public final class q extends kd.c {
    public Object f13189a;
    public a0 f13190b;
    public zd.t f13191c;
    public Object d;
    public final a0 e;
    public int f13192f;

    public q(a0 a0Var, kd.c cVar) {
        super(cVar);
        this.e = a0Var;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.f13192f |= Integer.MIN_VALUE;
        return a0.b(this.e, null, this);
    }
}
