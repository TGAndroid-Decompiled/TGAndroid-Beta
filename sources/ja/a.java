package ja;
public final class a extends sc.c {
    public Object f14249a;
    public qd.a f14250b;
    public Object f14251c;
    public final d d;
    public int f14252e;

    public a(d dVar, sc.c cVar) {
        super(cVar);
        this.d = dVar;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f14251c = obj;
        this.f14252e |= Integer.MIN_VALUE;
        return this.d.c(this);
    }
}
