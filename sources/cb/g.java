package cb;
public final class g extends md.c {
    public h f4696a;
    public Object f4697b;
    public final h f4698c;
    public int d;

    public g(h hVar, md.c cVar) {
        super(cVar);
        this.f4698c = hVar;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f4697b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.f4698c.b(this);
    }
}
