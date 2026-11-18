package ce;
public final class q extends kd.c {
    public m f5247a;
    public Object f5248b;
    public int f5249c;
    public final m d;
    public Object f5250e;

    public q(m mVar, id.c cVar) {
        super(cVar);
        this.d = mVar;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f5248b = obj;
        this.f5249c |= Integer.MIN_VALUE;
        return this.d.a(null, this);
    }
}
