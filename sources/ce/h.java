package ce;
public final class h extends kd.c {
    public i f4581a;
    public Object f4582b;
    public Object f4583c;
    public final i d;
    public int f4584e;

    public h(i iVar, kd.c cVar) {
        super(cVar);
        this.d = iVar;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f4583c = obj;
        this.f4584e |= Integer.MIN_VALUE;
        return this.d.a(null, this);
    }
}
