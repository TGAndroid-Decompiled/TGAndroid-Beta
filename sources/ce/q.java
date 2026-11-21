package ce;
public final class q extends kd.c {
    public m f5276a;
    public Object f5277b;
    public int f5278c;
    public final m d;
    public Object f5279e;

    public q(m mVar, id.c cVar) {
        super(cVar);
        this.d = mVar;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f5277b = obj;
        this.f5278c |= Integer.MIN_VALUE;
        return this.d.a(null, this);
    }
}
