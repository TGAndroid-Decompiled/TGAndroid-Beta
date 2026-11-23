package ce;
public final class p extends kd.c {
    public Object f5276a;
    public int f5277b;
    public final wf.b f5278c;
    public m d;

    public p(wf.b bVar, kd.c cVar) {
        super(cVar);
        this.f5278c = bVar;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f5276a = obj;
        this.f5277b |= Integer.MIN_VALUE;
        return this.f5278c.v(null, this);
    }
}
