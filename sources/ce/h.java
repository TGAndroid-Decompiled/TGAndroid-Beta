package ce;
public final class h extends kd.c {
    public i f4774a;
    public Object f4775b;
    public Object f4776c;
    public final i d;
    public int f4777e;

    public h(i iVar, kd.c cVar) {
        super(cVar);
        this.d = iVar;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f4776c = obj;
        this.f4777e |= Integer.MIN_VALUE;
        return this.d.a(null, this);
    }
}
