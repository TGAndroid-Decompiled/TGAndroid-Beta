package m1;
public final class r extends kd.c {
    public b0 f19456a;
    public ie.d f19457b;
    public Object f19458c;
    public final b0 d;
    public int f19459e;

    public r(b0 b0Var, kd.c cVar) {
        super(cVar);
        this.d = b0Var;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f19458c = obj;
        this.f19459e |= Integer.MIN_VALUE;
        return b0.d(this.d, this);
    }
}
