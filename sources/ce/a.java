package ce;
public final class a extends kd.c {
    public de.g f4221a;
    public Object f4222b;
    public final xa.c f4223c;
    public int d;

    public a(xa.c cVar, kd.c cVar2) {
        super(cVar2);
        this.f4223c = cVar;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f4222b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.f4223c.H(null, this);
    }
}
