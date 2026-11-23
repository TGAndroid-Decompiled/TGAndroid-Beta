package m1;
public final class r extends kd.c {
    public b0 f20440a;
    public ie.d f20441b;
    public Object f20442c;
    public final b0 d;
    public int f20443e;

    public r(b0 b0Var, kd.c cVar) {
        super(cVar);
        this.d = b0Var;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f20442c = obj;
        this.f20443e |= Integer.MIN_VALUE;
        return b0.d(this.d, this);
    }
}
