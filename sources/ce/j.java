package ce;
public final class j extends kd.c {
    public Object f4941a;
    public int f4942b;
    public final wf.b f4943c;
    public wf.b d;
    public d f4944e;

    public j(wf.b bVar, kd.c cVar) {
        super(cVar);
        this.f4943c = bVar;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f4941a = obj;
        this.f4942b |= Integer.MIN_VALUE;
        return this.f4943c.G(null, this);
    }
}
