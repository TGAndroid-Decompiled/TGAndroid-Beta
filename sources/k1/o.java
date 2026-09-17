package k1;
public final class o extends kd.c {
    public Object f14461a;
    public int f14462b;
    public final p f14463c;

    public o(p pVar, kd.c cVar) {
        super(cVar);
        this.f14463c = pVar;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f14461a = obj;
        this.f14462b |= Integer.MIN_VALUE;
        return this.f14463c.a(null, this);
    }
}
