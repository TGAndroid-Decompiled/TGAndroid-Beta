package ce;
public final class p extends kd.c {
    public Object f5247a;
    public int f5248b;
    public final wf.b f5249c;
    public m d;

    public p(wf.b bVar, kd.c cVar) {
        super(cVar);
        this.f5249c = bVar;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f5247a = obj;
        this.f5248b |= Integer.MIN_VALUE;
        return this.f5249c.v(null, this);
    }
}
