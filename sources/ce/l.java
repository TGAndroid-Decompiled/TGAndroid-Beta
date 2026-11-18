package ce;
public final class l extends kd.c {
    public m f5231a;
    public Object f5232b;
    public final m f5233c;
    public int d;

    public l(m mVar, id.c cVar) {
        super(cVar);
        this.f5233c = mVar;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f5232b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.f5233c.a(null, this);
    }
}
