package ce;
public final class a extends kd.c {
    public de.g f4566a;
    public Object f4567b;
    public final xa.c f4568c;
    public int d;

    public a(xa.c cVar, kd.c cVar2) {
        super(cVar2);
        this.f4568c = cVar;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f4567b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.f4568c.d(null, this);
    }
}
