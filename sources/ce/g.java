package ce;
public final class g extends kd.c {
    public Object f5245a;
    public int f5246b;
    public final h f5247c;
    public Object d;
    public d f5248e;

    public g(h hVar, kd.c cVar) {
        super(cVar);
        this.f5247c = hVar;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f5245a = obj;
        this.f5246b |= Integer.MIN_VALUE;
        return this.f5247c.v(null, this);
    }
}
