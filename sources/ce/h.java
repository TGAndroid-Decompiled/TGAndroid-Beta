package ce;
public final class h extends kd.c {
    public i f4801a;
    public Object f4802b;
    public Object f4803c;
    public final i d;
    public int f4804e;

    public h(i iVar, kd.c cVar) {
        super(cVar);
        this.d = iVar;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f4803c = obj;
        this.f4804e |= Integer.MIN_VALUE;
        return this.d.a(null, this);
    }
}
