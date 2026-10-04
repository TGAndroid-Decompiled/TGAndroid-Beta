package ce;
public final class a extends kd.c {
    public de.g f4565a;
    public Object f4566b;
    public final xa.c f4567c;
    public int d;

    public a(xa.c cVar, kd.c cVar2) {
        super(cVar2);
        this.f4567c = cVar;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f4566b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.f4567c.d(null, this);
    }
}
