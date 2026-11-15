package ce;
public final class l extends kd.c {
    public m f4945a;
    public Object f4946b;
    public final m f4947c;
    public int d;

    public l(m mVar, id.c cVar) {
        super(cVar);
        this.f4947c = mVar;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f4946b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.f4947c.a(null, this);
    }
}
