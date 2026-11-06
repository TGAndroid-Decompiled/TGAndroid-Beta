package ce;
public final class a extends kd.c {
    public de.h f6087a;
    public Object f6088b;
    public final d6.i f6089c;
    public int d;

    public a(d6.i iVar, kd.c cVar) {
        super(cVar);
        this.f6089c = iVar;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f6088b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.f6089c.B(null, this);
    }
}
