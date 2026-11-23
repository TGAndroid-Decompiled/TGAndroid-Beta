package ce;
public final class a extends kd.c {
    public de.h f5193a;
    public Object f5194b;
    public final ob.c f5195c;
    public int d;

    public a(ob.c cVar, kd.c cVar2) {
        super(cVar2);
        this.f5195c = cVar;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f5194b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.f5195c.J(null, this);
    }
}
