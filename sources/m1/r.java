package m1;
public final class r extends kd.c {
    public b0 f20409a;
    public ie.d f20410b;
    public Object f20411c;
    public final b0 d;
    public int f20412e;

    public r(b0 b0Var, kd.c cVar) {
        super(cVar);
        this.d = b0Var;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f20411c = obj;
        this.f20412e |= Integer.MIN_VALUE;
        return b0.d(this.d, this);
    }
}
