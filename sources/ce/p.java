package ce;
public final class p extends kd.c {
    public Object f5244a;
    public int f5245b;
    public final wf.b f5246c;
    public m d;

    public p(wf.b bVar, kd.c cVar) {
        super(cVar);
        this.f5246c = bVar;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f5244a = obj;
        this.f5245b |= Integer.MIN_VALUE;
        return this.f5246c.v(null, this);
    }
}
