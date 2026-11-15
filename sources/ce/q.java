package ce;
public final class q extends kd.c {
    public m f4964a;
    public Object f4965b;
    public int f4966c;
    public final m d;
    public Object f4967e;

    public q(m mVar, id.c cVar) {
        super(cVar);
        this.d = mVar;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f4965b = obj;
        this.f4966c |= Integer.MIN_VALUE;
        return this.d.a(null, this);
    }
}
