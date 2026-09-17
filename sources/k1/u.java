package k1;
public final class u extends kd.c {
    public a0 f13203a;
    public Object f13204b;
    public final a0 f13205c;
    public int d;

    public u(a0 a0Var, kd.c cVar) {
        super(cVar);
        this.f13205c = a0Var;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f13204b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.f13205c.d(this);
    }
}
