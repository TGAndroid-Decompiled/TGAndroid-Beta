package ee;
public final class d extends md.c {
    public Object f8734a;
    public int f8735b;
    public final qf.b f8736c;
    public qf.b d;
    public c e;

    public d(qf.b bVar, md.c cVar) {
        super(cVar);
        this.f8736c = bVar;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f8734a = obj;
        this.f8735b |= Integer.MIN_VALUE;
        return this.f8736c.g(null, this);
    }
}
