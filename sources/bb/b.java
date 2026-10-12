package bb;
public final class b extends ld.c {
    public Object f3803a;
    public je.a f3804b;
    public Object f3805c;
    public final e d;
    public int f3806e;

    public b(e eVar, ld.c cVar) {
        super(cVar);
        this.d = eVar;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f3805c = obj;
        this.f3806e |= Integer.MIN_VALUE;
        return this.d.c(this);
    }
}
