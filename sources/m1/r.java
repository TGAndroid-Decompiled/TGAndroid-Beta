package m1;
public final class r extends kd.c {
    public b0 f19451a;
    public ie.d f19452b;
    public Object f19453c;
    public final b0 d;
    public int f19454e;

    public r(b0 b0Var, kd.c cVar) {
        super(cVar);
        this.d = b0Var;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f19453c = obj;
        this.f19454e |= Integer.MIN_VALUE;
        return b0.d(this.d, this);
    }
}
