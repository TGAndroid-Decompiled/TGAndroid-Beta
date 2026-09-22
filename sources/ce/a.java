package ce;
public final class a extends kd.c {
    public de.g f4226a;
    public Object f4227b;
    public final xa.c f4228c;
    public int d;

    public a(xa.c cVar, kd.c cVar2) {
        super(cVar2);
        this.f4228c = cVar;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f4227b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.f4228c.u(null, this);
    }
}
