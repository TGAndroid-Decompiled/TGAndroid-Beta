package k1;
public final class u extends kd.c {
    public a0 f13204a;
    public Object f13205b;
    public final a0 f13206c;
    public int d;

    public u(a0 a0Var, kd.c cVar) {
        super(cVar);
        this.f13206c = a0Var;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f13205b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.f13206c.e(this);
    }
}
