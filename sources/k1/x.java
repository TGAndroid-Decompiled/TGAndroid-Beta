package k1;
public final class x extends kd.c {
    public Object f13211a;
    public Object f13212b;
    public Object f13213c;
    public final a0 d;
    public int e;

    public x(a0 a0Var, kd.c cVar) {
        super(cVar);
        this.d = a0Var;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f13213c = obj;
        this.e |= Integer.MIN_VALUE;
        return this.d.g(this);
    }
}
