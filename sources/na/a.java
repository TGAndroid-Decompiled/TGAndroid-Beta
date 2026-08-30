package na;
public final class a extends wc.c {
    public Object f14865a;
    public ud.a f14866b;
    public Object f14867c;
    public final d d;
    public int e;

    public a(d dVar, wc.c cVar) {
        super(cVar);
        this.d = dVar;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f14867c = obj;
        this.e |= Integer.MIN_VALUE;
        return this.d.c(this);
    }
}
