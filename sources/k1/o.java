package k1;
public final class o extends kd.c {
    public Object f14487a;
    public int f14488b;
    public final p f14489c;

    public o(p pVar, kd.c cVar) {
        super(cVar);
        this.f14489c = pVar;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f14487a = obj;
        this.f14488b |= Integer.MIN_VALUE;
        return this.f14489c.a(null, this);
    }
}
