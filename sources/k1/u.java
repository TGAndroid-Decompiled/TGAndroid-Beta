package k1;
public final class u extends kd.c {
    public a0 f13202a;
    public Object f13203b;
    public final a0 f13204c;
    public int d;

    public u(a0 a0Var, kd.c cVar) {
        super(cVar);
        this.f13204c = a0Var;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f13203b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.f13204c.d(this);
    }
}
