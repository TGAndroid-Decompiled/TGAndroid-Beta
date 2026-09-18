package k1;
public final class v extends kd.c {
    public a0 f13206a;
    public Object f13207b;
    public final a0 f13208c;
    public int d;

    public v(a0 a0Var, kd.c cVar) {
        super(cVar);
        this.f13208c = a0Var;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f13207b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.f13208c.e(this);
    }
}
