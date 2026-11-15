package ce;
public final class p extends kd.c {
    public Object f4958a;
    public int f4959b;
    public final wf.b f4960c;
    public m d;

    public p(wf.b bVar, kd.c cVar) {
        super(cVar);
        this.f4960c = bVar;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f4958a = obj;
        this.f4959b |= Integer.MIN_VALUE;
        return this.f4960c.G(null, this);
    }
}
