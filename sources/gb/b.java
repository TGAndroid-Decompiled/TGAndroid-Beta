package gb;
public final class b extends hd.c {
    public fe.a f12200a;
    public Object f12201b;
    public final d f12202c;
    public int d;

    public b(d dVar, hd.c cVar) {
        super(cVar);
        this.f12202c = dVar;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f12201b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.f12202c.a(this);
    }
}
