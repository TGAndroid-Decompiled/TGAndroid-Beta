package la;
public final class e0 extends wc.c {
    public Object f11755a;
    public final h0 f11756b;
    public int f11757c;

    public e0(h0 h0Var, wc.c cVar) {
        super(cVar);
        this.f11756b = h0Var;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f11755a = obj;
        this.f11757c |= Integer.MIN_VALUE;
        return h0.a(this.f11756b, this);
    }
}
