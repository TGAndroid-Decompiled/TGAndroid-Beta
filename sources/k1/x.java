package k1;
public final class x extends kd.c {
    public Object f12056a;
    public Object f12057b;
    public Object f12058c;
    public final a0 d;
    public int e;

    public x(a0 a0Var, kd.c cVar) {
        super(cVar);
        this.d = a0Var;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f12058c = obj;
        this.e |= Integer.MIN_VALUE;
        return this.d.g(this);
    }
}
