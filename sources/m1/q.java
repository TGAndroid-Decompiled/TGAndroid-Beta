package m1;
public final class q extends kd.c {
    public Object f19441a;
    public b0 f19442b;
    public zd.t f19443c;
    public Object d;
    public final b0 f19444e;
    public int f19445f;

    public q(b0 b0Var, kd.c cVar) {
        super(cVar);
        this.f19444e = b0Var;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.f19445f |= Integer.MIN_VALUE;
        return b0.c(this.f19444e, null, this);
    }
}
