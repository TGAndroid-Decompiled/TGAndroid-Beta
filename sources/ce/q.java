package ce;
public final class q extends kd.c {
    public m f5279a;
    public Object f5280b;
    public int f5281c;
    public final m d;
    public Object f5282e;

    public q(m mVar, id.c cVar) {
        super(cVar);
        this.d = mVar;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f5280b = obj;
        this.f5281c |= Integer.MIN_VALUE;
        return this.d.a(null, this);
    }
}
