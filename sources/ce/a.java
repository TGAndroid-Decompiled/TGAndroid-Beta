package ce;
public final class a extends kd.c {
    public de.g f4224a;
    public Object f4225b;
    public final xa.c f4226c;
    public int d;

    public a(xa.c cVar, kd.c cVar2) {
        super(cVar2);
        this.f4226c = cVar;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f4225b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.f4226c.H(null, this);
    }
}
