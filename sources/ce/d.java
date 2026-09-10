package ce;
public final class d extends kd.c {
    public Object f4644a;
    public int f4645b;
    public final of.b f4646c;
    public of.b d;
    public c e;

    public d(of.b bVar, kd.c cVar) {
        super(cVar);
        this.f4646c = bVar;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f4644a = obj;
        this.f4645b |= Integer.MIN_VALUE;
        return this.f4646c.u(null, this);
    }
}
