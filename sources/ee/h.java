package ee;
public final class h extends md.c {
    public i f8634a;
    public Object f8635b;
    public Object f8636c;
    public final i d;
    public int e;

    public h(i iVar, md.c cVar) {
        super(cVar);
        this.d = iVar;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f8636c = obj;
        this.e |= Integer.MIN_VALUE;
        return this.d.a(null, this);
    }
}
