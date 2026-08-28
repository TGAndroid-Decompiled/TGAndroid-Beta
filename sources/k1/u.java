package k1;
public final class u extends sc.c {
    public z f14487a;
    public Object f14488b;
    public final z f14489c;
    public int d;

    public u(z zVar, sc.c cVar) {
        super(cVar);
        this.f14489c = zVar;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f14488b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.f14489c.f(this);
    }
}
