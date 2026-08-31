package na;
public final class g extends wc.c {
    public h f15894a;
    public Object f15895b;
    public final h f15896c;
    public int d;

    public g(h hVar, wc.c cVar) {
        super(cVar);
        this.f15896c = hVar;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f15895b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.f15896c.b(this);
    }
}
