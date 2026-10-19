package ee;
public final class h extends md.c {
    public i f8627a;
    public Object f8628b;
    public Object f8629c;
    public final i d;
    public int e;

    public h(i iVar, md.c cVar) {
        super(cVar);
        this.d = iVar;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f8629c = obj;
        this.e |= Integer.MIN_VALUE;
        return this.d.a(null, this);
    }
}
