package m1;
public final class q extends kd.c {
    public Object f19444a;
    public b0 f19445b;
    public zd.t f19446c;
    public Object d;
    public final b0 f19447e;
    public int f19448f;

    public q(b0 b0Var, kd.c cVar) {
        super(cVar);
        this.f19447e = b0Var;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.f19448f |= Integer.MIN_VALUE;
        return b0.c(this.f19447e, null, this);
    }
}
