package k1;
public final class o extends kd.c {
    public Object f13181a;
    public int f13182b;
    public final p f13183c;

    public o(p pVar, kd.c cVar) {
        super(cVar);
        this.f13183c = pVar;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f13181a = obj;
        this.f13182b |= Integer.MIN_VALUE;
        return this.f13183c.a(null, this);
    }
}
