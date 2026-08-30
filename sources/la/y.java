package la;
public final class y extends wc.c {
    public Object f11830a;
    public int f11831b;
    public final k1.s f11832c;

    public y(k1.s sVar, wc.c cVar) {
        super(cVar);
        this.f11832c = sVar;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f11830a = obj;
        this.f11831b |= Integer.MIN_VALUE;
        return this.f11832c.c(null, this);
    }
}
