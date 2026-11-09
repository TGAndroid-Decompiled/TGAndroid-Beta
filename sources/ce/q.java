package ce;
public final class q extends kd.c {
    public m f6134a;
    public Object f6135b;
    public int f6136c;
    public final m d;
    public Object f6137e;

    public q(m mVar, id.c cVar) {
        super(cVar);
        this.d = mVar;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f6135b = obj;
        this.f6136c |= Integer.MIN_VALUE;
        return this.d.a(null, this);
    }
}
