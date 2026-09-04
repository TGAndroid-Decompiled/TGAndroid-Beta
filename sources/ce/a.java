package ce;
public final class a extends kd.c {
    public de.g f4759a;
    public Object f4760b;
    public final a4.m f4761c;
    public int d;

    public a(a4.m mVar, kd.c cVar) {
        super(cVar);
        this.f4761c = mVar;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f4760b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.f4761c.z(null, this);
    }
}
