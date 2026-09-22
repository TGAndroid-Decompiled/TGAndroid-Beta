package k1;
public final class q extends kd.c {
    public Object f13184a;
    public a0 f13185b;
    public zd.t f13186c;
    public Object d;
    public final a0 e;
    public int f13187f;

    public q(a0 a0Var, kd.c cVar) {
        super(cVar);
        this.e = a0Var;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.f13187f |= Integer.MIN_VALUE;
        return a0.a(this.e, null, this);
    }
}
