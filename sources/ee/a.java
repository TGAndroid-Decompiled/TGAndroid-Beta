package ee;
public final class a extends md.c {
    public fe.g f8734a;
    public Object f8735b;
    public final l f8736c;
    public int d;

    public a(l lVar, md.c cVar) {
        super(cVar);
        this.f8736c = lVar;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f8735b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.f8736c.g(null, this);
    }
}
