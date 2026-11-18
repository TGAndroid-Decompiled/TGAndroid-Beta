package ce;
public final class j extends kd.c {
    public Object f5227a;
    public int f5228b;
    public final wf.b f5229c;
    public wf.b d;
    public d f5230e;

    public j(wf.b bVar, kd.c cVar) {
        super(cVar);
        this.f5229c = bVar;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f5227a = obj;
        this.f5228b |= Integer.MIN_VALUE;
        return this.f5229c.v(null, this);
    }
}
