package k1;
public final class o extends kd.c {
    public Object f14318a;
    public int f14319b;
    public final p f14320c;

    public o(p pVar, kd.c cVar) {
        super(cVar);
        this.f14320c = pVar;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f14318a = obj;
        this.f14319b |= Integer.MIN_VALUE;
        return this.f14320c.a(null, this);
    }
}
