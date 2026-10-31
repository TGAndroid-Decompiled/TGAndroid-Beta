package db;
public final class a extends ed.c {
    public Object f5830a;
    public ce.a f5831b;
    public Object f5832c;
    public final d d;
    public int e;

    public a(d dVar, ed.c cVar) {
        super(cVar);
        this.d = dVar;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f5832c = obj;
        this.e |= Integer.MIN_VALUE;
        return this.d.c(this);
    }
}
