package cb;
public final class g extends md.c {
    public h f4693a;
    public Object f4694b;
    public final h f4695c;
    public int d;

    public g(h hVar, md.c cVar) {
        super(cVar);
        this.f4695c = hVar;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f4694b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.f4695c.b(this);
    }
}
