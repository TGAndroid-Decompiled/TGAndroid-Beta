package ce;
public final class a extends kd.c {
    public de.h f5198a;
    public Object f5199b;
    public final ob.c f5200c;
    public int d;

    public a(ob.c cVar, kd.c cVar2) {
        super(cVar2);
        this.f5200c = cVar;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f5199b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.f5200c.v(null, this);
    }
}
