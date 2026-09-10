package k1;
public final class y extends kd.c {
    public a0 f12059a;
    public Object f12060b;
    public Object f12061c;
    public Object d;
    public final a0 e;
    public int f12062f;

    public y(a0 a0Var, kd.c cVar) {
        super(cVar);
        this.e = a0Var;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.f12062f |= Integer.MIN_VALUE;
        return this.e.i(null, null, this);
    }
}
