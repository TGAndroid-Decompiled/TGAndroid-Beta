package ce;
public final class j extends kd.c {
    public Object f5224a;
    public int f5225b;
    public final wf.b f5226c;
    public wf.b d;
    public d f5227e;

    public j(wf.b bVar, kd.c cVar) {
        super(cVar);
        this.f5226c = bVar;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f5224a = obj;
        this.f5225b |= Integer.MIN_VALUE;
        return this.f5226c.v(null, this);
    }
}
