package m1;
public final class p extends kd.c {
    public b0 f20427a;
    public ie.d f20428b;
    public Object f20429c;
    public final b0 d;
    public int f20430e;

    public p(b0 b0Var, kd.c cVar) {
        super(cVar);
        this.d = b0Var;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f20429c = obj;
        this.f20430e |= Integer.MIN_VALUE;
        return b0.b(this.d, this);
    }
}
