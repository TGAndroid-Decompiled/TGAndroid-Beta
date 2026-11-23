package ce;
public final class j extends kd.c {
    public Object f5256a;
    public int f5257b;
    public final wf.b f5258c;
    public wf.b d;
    public d f5259e;

    public j(wf.b bVar, kd.c cVar) {
        super(cVar);
        this.f5258c = bVar;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f5256a = obj;
        this.f5257b |= Integer.MIN_VALUE;
        return this.f5258c.v(null, this);
    }
}
