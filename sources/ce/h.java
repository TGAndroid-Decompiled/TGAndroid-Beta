package ce;
public final class h extends kd.c {
    public i f4580a;
    public Object f4581b;
    public Object f4582c;
    public final i d;
    public int f4583e;

    public h(i iVar, kd.c cVar) {
        super(cVar);
        this.d = iVar;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f4582c = obj;
        this.f4583e |= Integer.MIN_VALUE;
        return this.d.a(null, this);
    }
}
