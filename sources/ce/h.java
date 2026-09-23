package ce;
public final class h extends kd.c {
    public i f4233a;
    public Object f4234b;
    public Object f4235c;
    public final i d;
    public int e;

    public h(i iVar, kd.c cVar) {
        super(cVar);
        this.d = iVar;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f4235c = obj;
        this.e |= Integer.MIN_VALUE;
        return this.d.a(null, this);
    }
}
