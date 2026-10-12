package cb;
public final class a extends md.c {
    public Object f4678a;
    public ke.a f4679b;
    public Object f4680c;
    public final d d;
    public int e;

    public a(d dVar, md.c cVar) {
        super(cVar);
        this.d = dVar;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f4680c = obj;
        this.e |= Integer.MIN_VALUE;
        return this.d.c(this);
    }
}
