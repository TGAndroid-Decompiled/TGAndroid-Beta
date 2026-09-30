package k1;
public final class v extends kd.c {
    public a0 f13210a;
    public Object f13211b;
    public final a0 f13212c;
    public int d;

    public v(a0 a0Var, kd.c cVar) {
        super(cVar);
        this.f13212c = a0Var;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f13211b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.f13212c.f(this);
    }
}
