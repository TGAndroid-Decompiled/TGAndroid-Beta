package ce;
public final class a extends kd.c {
    public de.h f4915a;
    public Object f4916b;
    public final d6.i f4917c;
    public int d;

    public a(d6.i iVar, kd.c cVar) {
        super(cVar);
        this.f4917c = iVar;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f4916b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.f4917c.G(null, this);
    }
}
