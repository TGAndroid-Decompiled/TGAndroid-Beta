package k1;
public final class v extends kd.c {
    public a0 f13198a;
    public Object f13199b;
    public final a0 f13200c;
    public int d;

    public v(a0 a0Var, kd.c cVar) {
        super(cVar);
        this.f13200c = a0Var;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f13199b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.f13200c.f(this);
    }
}
