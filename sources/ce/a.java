package ce;
public final class a extends kd.c {
    public de.h f5201a;
    public Object f5202b;
    public final ob.c f5203c;
    public int d;

    public a(ob.c cVar, kd.c cVar2) {
        super(cVar2);
        this.f5203c = cVar;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f5202b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.f5203c.v(null, this);
    }
}
