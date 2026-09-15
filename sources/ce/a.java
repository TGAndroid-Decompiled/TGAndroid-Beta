package ce;
public final class a extends kd.c {
    public de.g f4222a;
    public Object f4223b;
    public final xa.c f4224c;
    public int d;

    public a(xa.c cVar, kd.c cVar2) {
        super(cVar2);
        this.f4224c = cVar;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f4223b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.f4224c.H(null, this);
    }
}
