package ee;
public final class a extends md.c {
    public fe.g f8613a;
    public Object f8614b;
    public final qb.c f8615c;
    public int d;

    public a(qb.c cVar, md.c cVar2) {
        super(cVar2);
        this.f8615c = cVar;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f8614b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.f8615c.l(null, this);
    }
}
