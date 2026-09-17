package k1;
public final class x extends kd.c {
    public Object f14523a;
    public Object f14524b;
    public Object f14525c;
    public final a0 d;
    public int f14526e;

    public x(a0 a0Var, kd.c cVar) {
        super(cVar);
        this.d = a0Var;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f14525c = obj;
        this.f14526e |= Integer.MIN_VALUE;
        return this.d.g(this);
    }
}
