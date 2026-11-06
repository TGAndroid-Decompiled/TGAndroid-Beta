package ce;
public final class p extends kd.c {
    public Object f6133a;
    public int f6134b;
    public final wf.b f6135c;
    public m d;

    public p(wf.b bVar, kd.c cVar) {
        super(cVar);
        this.f6135c = bVar;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f6133a = obj;
        this.f6134b |= Integer.MIN_VALUE;
        return this.f6135c.B(null, this);
    }
}
