package od;
public final class h extends wc.c {
    public i f16540a;
    public Object f16541b;
    public Object f16542c;
    public final i d;
    public int e;

    public h(i iVar, wc.c cVar) {
        super(cVar);
        this.d = iVar;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f16542c = obj;
        this.e |= Integer.MIN_VALUE;
        return this.d.c(null, this);
    }
}
