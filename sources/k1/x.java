package k1;
public final class x extends kd.c {
    public Object f14497a;
    public Object f14498b;
    public Object f14499c;
    public final a0 d;
    public int f14500e;

    public x(a0 a0Var, kd.c cVar) {
        super(cVar);
        this.d = a0Var;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f14499c = obj;
        this.f14500e |= Integer.MIN_VALUE;
        return this.d.g(this);
    }
}
