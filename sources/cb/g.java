package cb;
public final class g extends md.c {
    public h f5066a;
    public Object f5067b;
    public final h f5068c;
    public int d;

    public g(h hVar, md.c cVar) {
        super(cVar);
        this.f5068c = hVar;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f5067b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.f5068c.b(this);
    }
}
