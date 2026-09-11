package k1;
public final class u extends kd.c {
    public a0 f14487a;
    public Object f14488b;
    public final a0 f14489c;
    public int d;

    public u(a0 a0Var, kd.c cVar) {
        super(cVar);
        this.f14489c = a0Var;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f14488b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.f14489c.d(this);
    }
}
