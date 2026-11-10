package ce;
public final class l extends kd.c {
    public m f6123a;
    public Object f6124b;
    public final m f6125c;
    public int d;

    public l(m mVar, id.c cVar) {
        super(cVar);
        this.f6125c = mVar;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f6124b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.f6125c.a(null, this);
    }
}
