package ce;
public final class q extends kd.c {
    public m f5250a;
    public Object f5251b;
    public int f5252c;
    public final m d;
    public Object f5253e;

    public q(m mVar, id.c cVar) {
        super(cVar);
        this.d = mVar;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f5251b = obj;
        this.f5252c |= Integer.MIN_VALUE;
        return this.d.a(null, this);
    }
}
