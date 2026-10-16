package cb;
public final class a extends md.c {
    public Object f4681a;
    public ke.a f4682b;
    public Object f4683c;
    public final d d;
    public int e;

    public a(d dVar, md.c cVar) {
        super(cVar);
        this.d = dVar;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f4683c = obj;
        this.e |= Integer.MIN_VALUE;
        return this.d.c(this);
    }
}
