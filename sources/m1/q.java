package m1;
public final class q extends kd.c {
    public Object f20495a;
    public b0 f20496b;
    public zd.t f20497c;
    public Object d;
    public final b0 f20498e;
    public int f20499f;

    public q(b0 b0Var, kd.c cVar) {
        super(cVar);
        this.f20498e = b0Var;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.f20499f |= Integer.MIN_VALUE;
        return b0.c(this.f20498e, null, this);
    }
}
