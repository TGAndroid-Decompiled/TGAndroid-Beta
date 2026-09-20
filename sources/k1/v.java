package k1;
public final class v extends kd.c {
    public a0 f13207a;
    public Object f13208b;
    public final a0 f13209c;
    public int d;

    public v(a0 a0Var, kd.c cVar) {
        super(cVar);
        this.f13209c = a0Var;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f13208b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.f13209c.f(this);
    }
}
