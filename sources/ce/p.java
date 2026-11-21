package ce;
public final class p extends kd.c {
    public Object f5273a;
    public int f5274b;
    public final wf.b f5275c;
    public m d;

    public p(wf.b bVar, kd.c cVar) {
        super(cVar);
        this.f5275c = bVar;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f5273a = obj;
        this.f5274b |= Integer.MIN_VALUE;
        return this.f5275c.v(null, this);
    }
}
