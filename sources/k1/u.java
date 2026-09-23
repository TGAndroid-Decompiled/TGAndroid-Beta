package k1;
public final class u extends kd.c {
    public a0 f13192a;
    public Object f13193b;
    public final a0 f13194c;
    public int d;

    public u(a0 a0Var, kd.c cVar) {
        super(cVar);
        this.f13194c = a0Var;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f13193b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.f13194c.d(this);
    }
}
