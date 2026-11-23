package ce;
public final class p extends kd.c {
    public Object f5239a;
    public int f5240b;
    public final wf.b f5241c;
    public m d;

    public p(wf.b bVar, kd.c cVar) {
        super(cVar);
        this.f5241c = bVar;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f5239a = obj;
        this.f5240b |= Integer.MIN_VALUE;
        return this.f5241c.J(null, this);
    }
}
