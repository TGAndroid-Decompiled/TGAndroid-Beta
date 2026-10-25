package bb;
public final class j0 extends nd.c {
    public k0 f3781a;
    public Object f3782b;
    public final k0 f3783c;
    public int d;

    public j0(k0 k0Var, nd.c cVar) {
        super(cVar);
        this.f3783c = k0Var;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f3782b = obj;
        this.d |= Integer.MIN_VALUE;
        return k0.b(this.f3783c, this);
    }
}
