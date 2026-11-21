package ce;
public final class a extends kd.c {
    public de.h f5227a;
    public Object f5228b;
    public final ob.c f5229c;
    public int d;

    public a(ob.c cVar, kd.c cVar2) {
        super(cVar2);
        this.f5229c = cVar;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f5228b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.f5229c.v(null, this);
    }
}
