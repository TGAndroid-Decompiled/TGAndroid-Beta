package ce;
public final class l extends kd.c {
    public m f6120a;
    public Object f6121b;
    public final m f6122c;
    public int d;

    public l(m mVar, id.c cVar) {
        super(cVar);
        this.f6122c = mVar;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f6121b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.f6122c.a(null, this);
    }
}
