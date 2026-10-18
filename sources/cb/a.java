package cb;
public final class a extends md.c {
    public Object f5052a;
    public ke.a f5053b;
    public Object f5054c;
    public final d d;
    public int e;

    public a(d dVar, md.c cVar) {
        super(cVar);
        this.d = dVar;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f5054c = obj;
        this.e |= Integer.MIN_VALUE;
        return this.d.c(this);
    }
}
