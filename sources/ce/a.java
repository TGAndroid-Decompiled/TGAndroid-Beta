package ce;
public final class a extends kd.c {
    public de.h f6085a;
    public Object f6086b;
    public final d6.i f6087c;
    public int d;

    public a(d6.i iVar, kd.c cVar) {
        super(cVar);
        this.f6087c = iVar;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f6086b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.f6087c.B(null, this);
    }
}
