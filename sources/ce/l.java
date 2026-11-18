package ce;
public final class l extends kd.c {
    public m f5234a;
    public Object f5235b;
    public final m f5236c;
    public int d;

    public l(m mVar, id.c cVar) {
        super(cVar);
        this.f5236c = mVar;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f5235b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.f5236c.a(null, this);
    }
}
