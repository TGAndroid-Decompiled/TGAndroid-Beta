package k1;
public final class o extends kd.c {
    public Object f12024a;
    public int f12025b;
    public final p f12026c;

    public o(p pVar, kd.c cVar) {
        super(cVar);
        this.f12026c = pVar;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f12024a = obj;
        this.f12025b |= Integer.MIN_VALUE;
        return this.f12026c.a(null, this);
    }
}
