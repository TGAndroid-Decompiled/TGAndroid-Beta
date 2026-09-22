package k1;
public final class o extends kd.c {
    public Object f13179a;
    public int f13180b;
    public final p f13181c;

    public o(p pVar, kd.c cVar) {
        super(cVar);
        this.f13181c = pVar;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f13179a = obj;
        this.f13180b |= Integer.MIN_VALUE;
        return this.f13181c.a(null, this);
    }
}
