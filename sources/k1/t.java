package k1;
public final class t extends nd.c {
    public z f16086a;
    public Object f16087b;
    public final z f16088c;
    public int d;

    public t(z zVar, nd.c cVar) {
        super(cVar);
        this.f16088c = zVar;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f16087b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.f16088c.d(this);
    }
}
