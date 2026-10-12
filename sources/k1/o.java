package k1;
public final class o extends ld.c {
    public Object f14351a;
    public int f14352b;
    public final p f14353c;

    public o(p pVar, ld.c cVar) {
        super(cVar);
        this.f14353c = pVar;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f14351a = obj;
        this.f14352b |= Integer.MIN_VALUE;
        return this.f14353c.b(null, this);
    }
}
