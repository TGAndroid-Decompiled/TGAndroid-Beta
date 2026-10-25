package bb;
public final class z extends nd.c {
    public Object f3832a;
    public int f3833b;
    public final a0 f3834c;

    public z(a0 a0Var, nd.c cVar) {
        super(cVar);
        this.f3834c = a0Var;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f3832a = obj;
        this.f3833b |= Integer.MIN_VALUE;
        return this.f3834c.b(null, this);
    }
}
