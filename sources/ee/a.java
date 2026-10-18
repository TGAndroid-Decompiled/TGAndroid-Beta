package ee;
public final class a extends md.c {
    public fe.g f8616a;
    public Object f8617b;
    public final a6.m f8618c;
    public int d;

    public a(a6.m mVar, md.c cVar) {
        super(cVar);
        this.f8618c = mVar;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f8617b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.f8618c.p(null, this);
    }
}
