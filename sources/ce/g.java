package ce;
public final class g extends kd.c {
    public Object f6105a;
    public int f6106b;
    public final h f6107c;
    public Object d;
    public d f6108e;

    public g(h hVar, kd.c cVar) {
        super(cVar);
        this.f6107c = hVar;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f6105a = obj;
        this.f6106b |= Integer.MIN_VALUE;
        return this.f6107c.B(null, this);
    }
}
