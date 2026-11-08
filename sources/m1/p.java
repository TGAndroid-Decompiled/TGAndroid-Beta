package m1;
public final class p extends kd.c {
    public b0 f19438a;
    public ie.d f19439b;
    public Object f19440c;
    public final b0 d;
    public int f19441e;

    public p(b0 b0Var, kd.c cVar) {
        super(cVar);
        this.d = b0Var;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f19440c = obj;
        this.f19441e |= Integer.MIN_VALUE;
        return b0.b(this.d, this);
    }
}
