package ce;
public final class l extends kd.c {
    public m f5263a;
    public Object f5264b;
    public final m f5265c;
    public int d;

    public l(m mVar, id.c cVar) {
        super(cVar);
        this.f5265c = mVar;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f5264b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.f5265c.a(null, this);
    }
}
