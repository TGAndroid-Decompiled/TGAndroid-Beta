package na;
public final class g extends wc.c {
    public h f14865a;
    public Object f14866b;
    public final h f14867c;
    public int d;

    public g(h hVar, wc.c cVar) {
        super(cVar);
        this.f14867c = hVar;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f14866b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.f14867c.b(this);
    }
}
