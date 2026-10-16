package ee;
public final class d extends md.c {
    public Object f8737a;
    public int f8738b;
    public final qf.b f8739c;
    public qf.b d;
    public c e;

    public d(qf.b bVar, md.c cVar) {
        super(cVar);
        this.f8739c = bVar;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f8737a = obj;
        this.f8738b |= Integer.MIN_VALUE;
        return this.f8739c.g(null, this);
    }
}
