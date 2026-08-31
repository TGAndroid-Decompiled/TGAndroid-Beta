package od;
public final class h extends wc.c {
    public i f16727a;
    public Object f16728b;
    public Object f16729c;
    public final i d;
    public int f16730e;

    public h(i iVar, wc.c cVar) {
        super(cVar);
        this.d = iVar;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f16729c = obj;
        this.f16730e |= Integer.MIN_VALUE;
        return this.d.c(null, this);
    }
}
