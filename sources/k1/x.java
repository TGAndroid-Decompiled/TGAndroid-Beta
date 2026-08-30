package k1;
public final class x extends wc.c {
    public d0 f9620a;
    public Object f9621b;
    public final d0 f9622c;
    public int d;

    public x(d0 d0Var, wc.c cVar) {
        super(cVar);
        this.f9622c = d0Var;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f9621b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.f9622c.d(this);
    }
}
