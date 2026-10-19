package ee;
public final class d extends md.c {
    public Object f8618a;
    public int f8619b;
    public final qf.b f8620c;
    public qf.b d;
    public c e;

    public d(qf.b bVar, md.c cVar) {
        super(cVar);
        this.f8620c = bVar;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f8618a = obj;
        this.f8619b |= Integer.MIN_VALUE;
        return this.f8620c.l(null, this);
    }
}
