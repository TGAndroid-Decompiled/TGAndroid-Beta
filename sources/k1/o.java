package k1;
public final class o extends nd.c {
    public Object f16066a;
    public int f16067b;
    public final bb.a0 f16068c;

    public o(bb.a0 a0Var, nd.c cVar) {
        super(cVar);
        this.f16068c = a0Var;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f16066a = obj;
        this.f16067b |= Integer.MIN_VALUE;
        return this.f16068c.b(null, this);
    }
}
