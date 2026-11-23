package m1;
public final class q extends kd.c {
    public Object f20433a;
    public b0 f20434b;
    public zd.t f20435c;
    public Object d;
    public final b0 f20436e;
    public int f20437f;

    public q(b0 b0Var, kd.c cVar) {
        super(cVar);
        this.f20436e = b0Var;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.f20437f |= Integer.MIN_VALUE;
        return b0.c(this.f20436e, null, this);
    }
}
