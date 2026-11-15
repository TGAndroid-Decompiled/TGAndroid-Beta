package ce;
public final class a extends kd.c {
    public de.h f4912a;
    public Object f4913b;
    public final d6.i f4914c;
    public int d;

    public a(d6.i iVar, kd.c cVar) {
        super(cVar);
        this.f4914c = iVar;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f4913b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.f4914c.G(null, this);
    }
}
