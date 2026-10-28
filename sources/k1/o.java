package k1;
public final class o extends nd.c {
    public Object f16065a;
    public int f16066b;
    public final bb.a0 f16067c;

    public o(bb.a0 a0Var, nd.c cVar) {
        super(cVar);
        this.f16067c = a0Var;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f16065a = obj;
        this.f16066b |= Integer.MIN_VALUE;
        return this.f16067c.b(null, this);
    }
}
