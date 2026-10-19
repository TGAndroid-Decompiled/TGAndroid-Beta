package cb;
public final class g extends md.c {
    public h f5064a;
    public Object f5065b;
    public final h f5066c;
    public int d;

    public g(h hVar, md.c cVar) {
        super(cVar);
        this.f5066c = hVar;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f5065b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.f5066c.b(this);
    }
}
