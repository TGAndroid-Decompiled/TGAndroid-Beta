package ce;
public final class a extends kd.c {
    public de.g f4219a;
    public Object f4220b;
    public final xa.c f4221c;
    public int d;

    public a(xa.c cVar, kd.c cVar2) {
        super(cVar2);
        this.f4221c = cVar;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f4220b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.f4221c.H(null, this);
    }
}
