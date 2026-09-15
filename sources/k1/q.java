package k1;
public final class q extends kd.c {
    public Object f13182a;
    public a0 f13183b;
    public zd.t f13184c;
    public Object d;
    public final a0 e;
    public int f13185f;

    public q(a0 a0Var, kd.c cVar) {
        super(cVar);
        this.e = a0Var;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.f13185f |= Integer.MIN_VALUE;
        return a0.a(this.e, null, this);
    }
}
