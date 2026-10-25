package db;
public final class a extends nd.c {
    public Object f8277a;
    public le.a f8278b;
    public Object f8279c;
    public final d d;
    public int e;

    public a(d dVar, nd.c cVar) {
        super(cVar);
        this.d = dVar;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f8279c = obj;
        this.e |= Integer.MIN_VALUE;
        return this.d.c(this);
    }
}
