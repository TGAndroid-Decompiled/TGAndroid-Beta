package m1;
public final class p extends kd.c {
    public b0 f20399a;
    public ie.d f20400b;
    public Object f20401c;
    public final b0 d;
    public int f20402e;

    public p(b0 b0Var, kd.c cVar) {
        super(cVar);
        this.d = b0Var;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f20401c = obj;
        this.f20402e |= Integer.MIN_VALUE;
        return b0.b(this.d, this);
    }
}
