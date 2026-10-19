package cb;
public final class a extends md.c {
    public Object f5049a;
    public ke.a f5050b;
    public Object f5051c;
    public final d d;
    public int e;

    public a(d dVar, md.c cVar) {
        super(cVar);
        this.d = dVar;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f5051c = obj;
        this.e |= Integer.MIN_VALUE;
        return this.d.c(this);
    }
}
