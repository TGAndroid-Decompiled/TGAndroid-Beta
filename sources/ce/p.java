package ce;
public final class p extends kd.c {
    public Object f6131a;
    public int f6132b;
    public final wf.b f6133c;
    public m d;

    public p(wf.b bVar, kd.c cVar) {
        super(cVar);
        this.f6133c = bVar;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f6131a = obj;
        this.f6132b |= Integer.MIN_VALUE;
        return this.f6133c.B(null, this);
    }
}
