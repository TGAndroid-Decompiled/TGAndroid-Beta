package m1;
public final class q extends kd.c {
    public Object f20399a;
    public b0 f20400b;
    public zd.t f20401c;
    public Object d;
    public final b0 f20402e;
    public int f20403f;

    public q(b0 b0Var, kd.c cVar) {
        super(cVar);
        this.f20402e = b0Var;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.f20403f |= Integer.MIN_VALUE;
        return b0.c(this.f20402e, null, this);
    }
}
