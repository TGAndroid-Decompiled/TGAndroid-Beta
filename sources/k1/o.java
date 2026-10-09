package k1;
public final class o extends ld.c {
    public Object f14354a;
    public int f14355b;
    public final p f14356c;

    public o(p pVar, ld.c cVar) {
        super(cVar);
        this.f14356c = pVar;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f14354a = obj;
        this.f14355b |= Integer.MIN_VALUE;
        return this.f14356c.b(null, this);
    }
}
