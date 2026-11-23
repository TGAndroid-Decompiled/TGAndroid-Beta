package ce;
public final class l extends kd.c {
    public m f5226a;
    public Object f5227b;
    public final m f5228c;
    public int d;

    public l(m mVar, id.c cVar) {
        super(cVar);
        this.f5228c = mVar;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f5227b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.f5228c.a(null, this);
    }
}
