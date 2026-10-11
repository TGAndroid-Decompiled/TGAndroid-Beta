package k1;
public final class o extends ld.c {
    public Object f14353a;
    public int f14354b;
    public final p f14355c;

    public o(p pVar, ld.c cVar) {
        super(cVar);
        this.f14355c = pVar;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f14353a = obj;
        this.f14354b |= Integer.MIN_VALUE;
        return this.f14355c.b(null, this);
    }
}
