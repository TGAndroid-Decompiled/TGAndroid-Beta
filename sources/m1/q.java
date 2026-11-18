package m1;
public final class q extends kd.c {
    public Object f20405a;
    public b0 f20406b;
    public zd.t f20407c;
    public Object d;
    public final b0 f20408e;
    public int f20409f;

    public q(b0 b0Var, kd.c cVar) {
        super(cVar);
        this.f20408e = b0Var;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.f20409f |= Integer.MIN_VALUE;
        return b0.c(this.f20408e, null, this);
    }
}
