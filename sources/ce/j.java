package ce;
public final class j extends kd.c {
    public Object f5219a;
    public int f5220b;
    public final wf.b f5221c;
    public wf.b d;
    public d f5222e;

    public j(wf.b bVar, kd.c cVar) {
        super(cVar);
        this.f5221c = bVar;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f5219a = obj;
        this.f5220b |= Integer.MIN_VALUE;
        return this.f5221c.J(null, this);
    }
}
