package ce;
public final class q extends kd.c {
    public m f6136a;
    public Object f6137b;
    public int f6138c;
    public final m d;
    public Object f6139e;

    public q(m mVar, id.c cVar) {
        super(cVar);
        this.d = mVar;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f6137b = obj;
        this.f6138c |= Integer.MIN_VALUE;
        return this.d.a(null, this);
    }
}
