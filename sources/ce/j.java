package ce;
public final class j extends kd.c {
    public Object f6113a;
    public int f6114b;
    public final wf.b f6115c;
    public wf.b d;
    public d f6116e;

    public j(wf.b bVar, kd.c cVar) {
        super(cVar);
        this.f6115c = bVar;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f6113a = obj;
        this.f6114b |= Integer.MIN_VALUE;
        return this.f6115c.B(null, this);
    }
}
