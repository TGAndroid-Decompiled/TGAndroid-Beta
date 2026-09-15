package k1;
public final class u extends kd.c {
    public a0 f13200a;
    public Object f13201b;
    public final a0 f13202c;
    public int d;

    public u(a0 a0Var, kd.c cVar) {
        super(cVar);
        this.f13202c = a0Var;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f13201b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.f13202c.d(this);
    }
}
