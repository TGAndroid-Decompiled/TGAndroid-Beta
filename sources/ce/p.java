package ce;
public final class p extends kd.c {
    public Object f6136a;
    public int f6137b;
    public final wf.b f6138c;
    public m d;

    public p(wf.b bVar, kd.c cVar) {
        super(cVar);
        this.f6138c = bVar;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f6136a = obj;
        this.f6137b |= Integer.MIN_VALUE;
        return this.f6138c.B(null, this);
    }
}
