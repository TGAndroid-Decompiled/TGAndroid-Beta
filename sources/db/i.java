package db;
public final class i extends nd.c {
    public Object f8298a;
    public final k f8299b;
    public int f8300c;

    public i(k kVar, nd.c cVar) {
        super(cVar);
        this.f8299b = kVar;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f8298a = obj;
        this.f8300c |= Integer.MIN_VALUE;
        return this.f8299b.c(null, null, this);
    }
}
