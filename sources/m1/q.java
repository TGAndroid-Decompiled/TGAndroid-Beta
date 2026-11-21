package m1;
public final class q extends kd.c {
    public Object f20430a;
    public b0 f20431b;
    public zd.t f20432c;
    public Object d;
    public final b0 f20433e;
    public int f20434f;

    public q(b0 b0Var, kd.c cVar) {
        super(cVar);
        this.f20433e = b0Var;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.f20434f |= Integer.MIN_VALUE;
        return b0.c(this.f20433e, null, this);
    }
}
