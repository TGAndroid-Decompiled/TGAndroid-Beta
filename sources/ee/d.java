package ee;
public final class d extends md.c {
    public Object f8619a;
    public int f8620b;
    public final qf.b f8621c;
    public qf.b d;
    public c e;

    public d(qf.b bVar, md.c cVar) {
        super(cVar);
        this.f8621c = bVar;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f8619a = obj;
        this.f8620b |= Integer.MIN_VALUE;
        return this.f8621c.p(null, this);
    }
}
