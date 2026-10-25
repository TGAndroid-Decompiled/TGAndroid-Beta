package k1;
public final class t extends nd.c {
    public z f16087a;
    public Object f16088b;
    public final z f16089c;
    public int d;

    public t(z zVar, nd.c cVar) {
        super(cVar);
        this.f16089c = zVar;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f16088b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.f16089c.d(this);
    }
}
