package m1;
public final class q extends kd.c {
    public Object f20038a;
    public b0 f20039b;
    public zd.t f20040c;
    public Object d;
    public final b0 f20041e;
    public int f20042f;

    public q(b0 b0Var, kd.c cVar) {
        super(cVar);
        this.f20041e = b0Var;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.f20042f |= Integer.MIN_VALUE;
        return b0.c(this.f20041e, null, this);
    }
}
