package ce;
public final class a extends kd.c {
    public de.g f4228a;
    public Object f4229b;
    public final xa.c f4230c;
    public int d;

    public a(xa.c cVar, kd.c cVar2) {
        super(cVar2);
        this.f4230c = cVar;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f4229b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.f4230c.s(null, this);
    }
}
