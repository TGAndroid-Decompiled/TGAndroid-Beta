package ce;
public final class g extends kd.c {
    public Object f5213a;
    public int f5214b;
    public final h f5215c;
    public Object d;
    public d f5216e;

    public g(h hVar, kd.c cVar) {
        super(cVar);
        this.f5215c = hVar;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f5213a = obj;
        this.f5214b |= Integer.MIN_VALUE;
        return this.f5215c.v(null, this);
    }
}
