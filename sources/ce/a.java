package ce;
public final class a extends kd.c {
    public de.h f6090a;
    public Object f6091b;
    public final d6.i f6092c;
    public int d;

    public a(d6.i iVar, kd.c cVar) {
        super(cVar);
        this.f6092c = iVar;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f6091b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.f6092c.B(null, this);
    }
}
