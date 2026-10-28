package k1;
public final class p extends nd.c {
    public Object f16068a;
    public z f16069b;
    public ce.t f16070c;
    public Object d;
    public final z e;
    public int f16071f;

    public p(z zVar, nd.c cVar) {
        super(cVar);
        this.e = zVar;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.f16071f |= Integer.MIN_VALUE;
        return z.a(this.e, null, this);
    }
}
