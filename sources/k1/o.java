package k1;
public final class o extends ld.c {
    public Object f14350a;
    public int f14351b;
    public final p f14352c;

    public o(p pVar, ld.c cVar) {
        super(cVar);
        this.f14352c = pVar;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f14350a = obj;
        this.f14351b |= Integer.MIN_VALUE;
        return this.f14352c.b(null, this);
    }
}
