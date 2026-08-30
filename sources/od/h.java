package od;
public final class h extends wc.c {
    public i f16558a;
    public Object f16559b;
    public Object f16560c;
    public final i d;
    public int e;

    public h(i iVar, wc.c cVar) {
        super(cVar);
        this.d = iVar;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f16560c = obj;
        this.e |= Integer.MIN_VALUE;
        return this.d.c(null, this);
    }
}
