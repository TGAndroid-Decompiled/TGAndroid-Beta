package ce;
public final class a extends kd.c {
    public de.g f4227a;
    public Object f4228b;
    public final xa.c f4229c;
    public int d;

    public a(xa.c cVar, kd.c cVar2) {
        super(cVar2);
        this.f4229c = cVar;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f4228b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.f4229c.H(null, this);
    }
}
