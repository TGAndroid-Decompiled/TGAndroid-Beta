package ee;
public final class d extends md.c {
    public Object f8617a;
    public int f8618b;
    public final qf.b f8619c;
    public qf.b d;
    public c e;

    public d(qf.b bVar, md.c cVar) {
        super(cVar);
        this.f8619c = bVar;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f8617a = obj;
        this.f8618b |= Integer.MIN_VALUE;
        return this.f8619c.r(null, this);
    }
}
