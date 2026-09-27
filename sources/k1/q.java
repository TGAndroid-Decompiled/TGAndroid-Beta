package k1;
public final class q extends kd.c {
    public Object f13177a;
    public a0 f13178b;
    public zd.t f13179c;
    public Object d;
    public final a0 e;
    public int f13180f;

    public q(a0 a0Var, kd.c cVar) {
        super(cVar);
        this.e = a0Var;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.f13180f |= Integer.MIN_VALUE;
        return a0.b(this.e, null, this);
    }
}
