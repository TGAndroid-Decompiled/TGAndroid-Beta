package bb;
public final class h extends ld.c {
    public i f3821a;
    public Object f3822b;
    public final i f3823c;
    public int d;

    public h(i iVar, ld.c cVar) {
        super(cVar);
        this.f3823c = iVar;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f3822b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.f3823c.b(this);
    }
}
