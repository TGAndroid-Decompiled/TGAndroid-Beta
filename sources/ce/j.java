package ce;
public final class j extends kd.c {
    public Object f6111a;
    public int f6112b;
    public final wf.b f6113c;
    public wf.b d;
    public d f6114e;

    public j(wf.b bVar, kd.c cVar) {
        super(cVar);
        this.f6113c = bVar;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f6111a = obj;
        this.f6112b |= Integer.MIN_VALUE;
        return this.f6113c.B(null, this);
    }
}
