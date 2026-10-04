package k1;
public final class x extends kd.c {
    public Object f14353a;
    public Object f14354b;
    public Object f14355c;
    public final a0 d;
    public int f14356e;

    public x(a0 a0Var, kd.c cVar) {
        super(cVar);
        this.d = a0Var;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f14355c = obj;
        this.f14356e |= Integer.MIN_VALUE;
        return this.d.g(this);
    }
}
