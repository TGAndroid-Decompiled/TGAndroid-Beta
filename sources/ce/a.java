package ce;
public final class a extends kd.c {
    public de.g f4641a;
    public Object f4642b;
    public final m f4643c;
    public int d;

    public a(m mVar, kd.c cVar) {
        super(cVar);
        this.f4643c = mVar;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f4642b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.f4643c.u(null, this);
    }
}
