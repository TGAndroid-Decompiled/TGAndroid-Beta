package na;
public final class g extends wc.c {
    public h f15896a;
    public Object f15897b;
    public final h f15898c;
    public int d;

    public g(h hVar, wc.c cVar) {
        super(cVar);
        this.f15898c = hVar;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f15897b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.f15898c.b(this);
    }
}
