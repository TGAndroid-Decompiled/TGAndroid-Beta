package k1;
public final class r extends wc.c {
    public Object f9597a;
    public int f9598b;
    public final s f9599c;

    public r(s sVar, wc.c cVar) {
        super(cVar);
        this.f9599c = sVar;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f9597a = obj;
        this.f9598b |= Integer.MIN_VALUE;
        return this.f9599c.c(null, this);
    }
}
