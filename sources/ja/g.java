package ja;
public final class g extends sc.c {
    public h f14267a;
    public Object f14268b;
    public final h f14269c;
    public int d;

    public g(h hVar, sc.c cVar) {
        super(cVar);
        this.f14269c = hVar;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f14268b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.f14269c.b(this);
    }
}
