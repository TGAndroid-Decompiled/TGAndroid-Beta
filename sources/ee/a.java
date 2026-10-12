package ee;
public final class a extends md.c {
    public fe.g f8731a;
    public Object f8732b;
    public final l f8733c;
    public int d;

    public a(l lVar, md.c cVar) {
        super(cVar);
        this.f8733c = lVar;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f8732b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.f8733c.g(null, this);
    }
}
