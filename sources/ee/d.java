package ee;
public final class d extends md.c {
    public Object f8616a;
    public int f8617b;
    public final qf.b f8618c;
    public qf.b d;
    public c e;

    public d(qf.b bVar, md.c cVar) {
        super(cVar);
        this.f8618c = bVar;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f8616a = obj;
        this.f8617b |= Integer.MIN_VALUE;
        return this.f8618c.l(null, this);
    }
}
