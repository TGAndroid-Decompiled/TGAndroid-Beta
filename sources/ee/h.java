package ee;
public final class h extends md.c {
    public i f8745a;
    public Object f8746b;
    public Object f8747c;
    public final i d;
    public int e;

    public h(i iVar, md.c cVar) {
        super(cVar);
        this.d = iVar;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f8747c = obj;
        this.e |= Integer.MIN_VALUE;
        return this.d.a(null, this);
    }
}
