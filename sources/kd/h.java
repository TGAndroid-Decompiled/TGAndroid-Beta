package kd;
public final class h extends sc.c {
    public i f14775a;
    public Object f14776b;
    public Object f14777c;
    public final i d;
    public int f14778e;

    public h(i iVar, sc.c cVar) {
        super(cVar);
        this.d = iVar;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f14777c = obj;
        this.f14778e |= Integer.MIN_VALUE;
        return this.d.c(null, this);
    }
}
