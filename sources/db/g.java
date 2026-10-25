package db;
public final class g extends nd.c {
    public h f8292a;
    public Object f8293b;
    public final h f8294c;
    public int d;

    public g(h hVar, nd.c cVar) {
        super(cVar);
        this.f8294c = hVar;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f8293b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.f8294c.b(this);
    }
}
