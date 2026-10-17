package ee;
public final class a extends md.c {
    public fe.g f8615a;
    public Object f8616b;
    public final a6.m f8617c;
    public int d;

    public a(a6.m mVar, md.c cVar) {
        super(cVar);
        this.f8617c = mVar;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f8616b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.f8617c.r(null, this);
    }
}
