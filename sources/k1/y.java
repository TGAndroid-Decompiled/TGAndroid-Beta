package k1;
public final class y extends wc.c {
    public d0 f9623a;
    public Object f9624b;
    public final d0 f9625c;
    public int d;

    public y(d0 d0Var, wc.c cVar) {
        super(cVar);
        this.f9625c = d0Var;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f9624b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.f9625c.e(this);
    }
}
