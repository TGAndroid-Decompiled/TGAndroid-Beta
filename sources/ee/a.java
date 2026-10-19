package ee;
public final class a extends md.c {
    public fe.g f8615a;
    public Object f8616b;
    public final qb.c f8617c;
    public int d;

    public a(qb.c cVar, md.c cVar2) {
        super(cVar2);
        this.f8617c = cVar;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f8616b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.f8617c.l(null, this);
    }
}
