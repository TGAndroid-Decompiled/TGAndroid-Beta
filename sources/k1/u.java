package k1;
public final class u extends nd.c {
    public z f16090a;
    public Object f16091b;
    public final z f16092c;
    public int d;

    public u(z zVar, nd.c cVar) {
        super(cVar);
        this.f16092c = zVar;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f16091b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.f16092c.e(this);
    }
}
