package cb;
public final class g extends md.c {
    public h f5067a;
    public Object f5068b;
    public final h f5069c;
    public int d;

    public g(h hVar, md.c cVar) {
        super(cVar);
        this.f5069c = hVar;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f5068b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.f5069c.b(this);
    }
}
