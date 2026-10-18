package ee;
public final class a extends md.c {
    public fe.g f8614a;
    public Object f8615b;
    public final a6.m f8616c;
    public int d;

    public a(a6.m mVar, md.c cVar) {
        super(cVar);
        this.f8616c = mVar;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f8615b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.f8616c.r(null, this);
    }
}
