package ce;
public final class l extends kd.c {
    public m f5260a;
    public Object f5261b;
    public final m f5262c;
    public int d;

    public l(m mVar, id.c cVar) {
        super(cVar);
        this.f5262c = mVar;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f5261b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.f5262c.a(null, this);
    }
}
