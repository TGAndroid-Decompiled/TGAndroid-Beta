package kd;
public final class d extends sc.c {
    public Object f14763a;
    public int f14764b;
    public final g5.b f14765c;
    public g5.b d;
    public c f14766e;

    public d(g5.b bVar, sc.c cVar) {
        super(cVar);
        this.f14765c = bVar;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f14763a = obj;
        this.f14764b |= Integer.MIN_VALUE;
        return this.f14765c.q(null, this);
    }
}
