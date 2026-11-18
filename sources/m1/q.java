package m1;
public final class q extends kd.c {
    public Object f20402a;
    public b0 f20403b;
    public zd.t f20404c;
    public Object d;
    public final b0 f20405e;
    public int f20406f;

    public q(b0 b0Var, kd.c cVar) {
        super(cVar);
        this.f20405e = b0Var;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.f20406f |= Integer.MIN_VALUE;
        return b0.c(this.f20405e, null, this);
    }
}
