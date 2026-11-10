package ce;
public final class q extends kd.c {
    public m f6139a;
    public Object f6140b;
    public int f6141c;
    public final m d;
    public Object f6142e;

    public q(m mVar, id.c cVar) {
        super(cVar);
        this.d = mVar;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f6140b = obj;
        this.f6141c |= Integer.MIN_VALUE;
        return this.d.a(null, this);
    }
}
