package na;
public final class g extends wc.c {
    public h f14880a;
    public Object f14881b;
    public final h f14882c;
    public int d;

    public g(h hVar, wc.c cVar) {
        super(cVar);
        this.f14882c = hVar;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f14881b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.f14882c.b(this);
    }
}
