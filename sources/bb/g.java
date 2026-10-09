package bb;
public final class g extends ld.c {
    public h f3822a;
    public Object f3823b;
    public final h f3824c;
    public int d;

    public g(h hVar, ld.c cVar) {
        super(cVar);
        this.f3824c = hVar;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f3823b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.f3824c.b(this);
    }
}
