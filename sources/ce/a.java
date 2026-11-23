package ce;
public final class a extends kd.c {
    public de.h f5230a;
    public Object f5231b;
    public final ob.c f5232c;
    public int d;

    public a(ob.c cVar, kd.c cVar2) {
        super(cVar2);
        this.f5232c = cVar;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f5231b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.f5232c.v(null, this);
    }
}
