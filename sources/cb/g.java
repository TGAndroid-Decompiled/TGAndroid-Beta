package cb;
public final class g extends md.c {
    public h f5069a;
    public Object f5070b;
    public final h f5071c;
    public int d;

    public g(h hVar, md.c cVar) {
        super(cVar);
        this.f5071c = hVar;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f5070b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.f5071c.b(this);
    }
}
