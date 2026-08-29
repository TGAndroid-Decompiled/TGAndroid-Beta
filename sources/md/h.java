package md;
public final class h extends uc.c {
    public i f16993a;
    public Object f16994b;
    public Object f16995c;
    public final i d;
    public int f16996e;

    public h(i iVar, uc.c cVar) {
        super(cVar);
        this.d = iVar;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f16995c = obj;
        this.f16996e |= Integer.MIN_VALUE;
        return this.d.c(null, this);
    }
}
