package la;
public final class e0 extends wc.c {
    public Object f12165a;
    public final h0 f12166b;
    public int f12167c;

    public e0(h0 h0Var, wc.c cVar) {
        super(cVar);
        this.f12166b = h0Var;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f12165a = obj;
        this.f12167c |= Integer.MIN_VALUE;
        return h0.a(this.f12166b, this);
    }
}
