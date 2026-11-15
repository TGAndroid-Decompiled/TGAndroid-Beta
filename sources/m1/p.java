package m1;
public final class p extends kd.c {
    public b0 f20032a;
    public ie.d f20033b;
    public Object f20034c;
    public final b0 d;
    public int f20035e;

    public p(b0 b0Var, kd.c cVar) {
        super(cVar);
        this.d = b0Var;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f20034c = obj;
        this.f20035e |= Integer.MIN_VALUE;
        return b0.b(this.d, this);
    }
}
