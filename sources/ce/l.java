package ce;
public final class l extends kd.c {
    public m f6118a;
    public Object f6119b;
    public final m f6120c;
    public int d;

    public l(m mVar, id.c cVar) {
        super(cVar);
        this.f6120c = mVar;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f6119b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.f6120c.a(null, this);
    }
}
