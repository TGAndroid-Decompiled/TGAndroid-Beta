package ee;
public final class d extends md.c {
    public Object f8623a;
    public int f8624b;
    public final qf.b f8625c;
    public qf.b d;
    public c e;

    public d(qf.b bVar, md.c cVar) {
        super(cVar);
        this.f8625c = bVar;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f8623a = obj;
        this.f8624b |= Integer.MIN_VALUE;
        return this.f8625c.q(null, this);
    }
}
