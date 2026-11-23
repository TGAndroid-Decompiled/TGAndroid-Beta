package ce;
public final class q extends kd.c {
    public m f5242a;
    public Object f5243b;
    public int f5244c;
    public final m d;
    public Object f5245e;

    public q(m mVar, id.c cVar) {
        super(cVar);
        this.d = mVar;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f5243b = obj;
        this.f5244c |= Integer.MIN_VALUE;
        return this.d.a(null, this);
    }
}
