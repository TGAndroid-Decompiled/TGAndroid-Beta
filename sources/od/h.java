package od;
public final class h extends wc.c {
    public i f16729a;
    public Object f16730b;
    public Object f16731c;
    public final i d;
    public int f16732e;

    public h(i iVar, wc.c cVar) {
        super(cVar);
        this.d = iVar;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f16731c = obj;
        this.f16732e |= Integer.MIN_VALUE;
        return this.d.c(null, this);
    }
}
