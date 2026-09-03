package la;
public final class e0 extends wc.c {
    public Object f11865a;
    public final h0 f11866b;
    public int f11867c;

    public e0(h0 h0Var, wc.c cVar) {
        super(cVar);
        this.f11866b = h0Var;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f11865a = obj;
        this.f11867c |= Integer.MIN_VALUE;
        return h0.a(this.f11866b, this);
    }
}
