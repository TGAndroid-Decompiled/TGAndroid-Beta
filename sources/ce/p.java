package ce;
public final class p extends kd.c {
    public Object f4961a;
    public int f4962b;
    public final wf.b f4963c;
    public m d;

    public p(wf.b bVar, kd.c cVar) {
        super(cVar);
        this.f4963c = bVar;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f4961a = obj;
        this.f4962b |= Integer.MIN_VALUE;
        return this.f4963c.G(null, this);
    }
}
