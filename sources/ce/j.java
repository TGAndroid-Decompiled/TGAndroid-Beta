package ce;
public final class j extends kd.c {
    public Object f5253a;
    public int f5254b;
    public final wf.b f5255c;
    public wf.b d;
    public d f5256e;

    public j(wf.b bVar, kd.c cVar) {
        super(cVar);
        this.f5255c = bVar;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f5253a = obj;
        this.f5254b |= Integer.MIN_VALUE;
        return this.f5255c.v(null, this);
    }
}
