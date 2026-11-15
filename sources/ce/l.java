package ce;
public final class l extends kd.c {
    public m f4948a;
    public Object f4949b;
    public final m f4950c;
    public int d;

    public l(m mVar, id.c cVar) {
        super(cVar);
        this.f4950c = mVar;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f4949b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.f4950c.a(null, this);
    }
}
