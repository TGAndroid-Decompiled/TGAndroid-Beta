package ce;
public final class q extends kd.c {
    public m f4961a;
    public Object f4962b;
    public int f4963c;
    public final m d;
    public Object f4964e;

    public q(m mVar, id.c cVar) {
        super(cVar);
        this.d = mVar;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f4962b = obj;
        this.f4963c |= Integer.MIN_VALUE;
        return this.d.a(null, this);
    }
}
