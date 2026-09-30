package k1;
public final class o extends kd.c {
    public Object f13184a;
    public int f13185b;
    public final p f13186c;

    public o(p pVar, kd.c cVar) {
        super(cVar);
        this.f13186c = pVar;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f13184a = obj;
        this.f13185b |= Integer.MIN_VALUE;
        return this.f13186c.a(null, this);
    }
}
