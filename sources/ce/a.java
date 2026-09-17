package ce;
public final class a extends kd.c {
    public de.g f4786a;
    public Object f4787b;
    public final a4.m f4788c;
    public int d;

    public a(a4.m mVar, kd.c cVar) {
        super(cVar);
        this.f4788c = mVar;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f4787b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.f4788c.z(null, this);
    }
}
