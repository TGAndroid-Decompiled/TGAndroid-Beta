package m1;
public final class q extends kd.c {
    public Object f19449a;
    public b0 f19450b;
    public zd.t f19451c;
    public Object d;
    public final b0 f19452e;
    public int f19453f;

    public q(b0 b0Var, kd.c cVar) {
        super(cVar);
        this.f19452e = b0Var;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.f19453f |= Integer.MIN_VALUE;
        return b0.c(this.f19452e, null, this);
    }
}
