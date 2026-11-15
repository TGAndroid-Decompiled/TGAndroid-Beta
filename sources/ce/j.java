package ce;
public final class j extends kd.c {
    public Object f4938a;
    public int f4939b;
    public final wf.b f4940c;
    public wf.b d;
    public d f4941e;

    public j(wf.b bVar, kd.c cVar) {
        super(cVar);
        this.f4940c = bVar;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f4938a = obj;
        this.f4939b |= Integer.MIN_VALUE;
        return this.f4940c.G(null, this);
    }
}
