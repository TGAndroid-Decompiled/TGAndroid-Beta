package ee;
public final class a extends md.c {
    public fe.g f8620a;
    public Object f8621b;
    public final qb.c f8622c;
    public int d;

    public a(qb.c cVar, md.c cVar2) {
        super(cVar2);
        this.f8622c = cVar;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f8621b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.f8622c.q(null, this);
    }
}
