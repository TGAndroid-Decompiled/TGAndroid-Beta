package ce;
public final class j extends kd.c {
    public Object f6116a;
    public int f6117b;
    public final wf.b f6118c;
    public wf.b d;
    public d f6119e;

    public j(wf.b bVar, kd.c cVar) {
        super(cVar);
        this.f6118c = bVar;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f6116a = obj;
        this.f6117b |= Integer.MIN_VALUE;
        return this.f6118c.B(null, this);
    }
}
