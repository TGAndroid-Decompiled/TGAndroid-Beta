package k1;
public final class y extends kd.c {
    public a0 f13204a;
    public Object f13205b;
    public Object f13206c;
    public Object d;
    public final a0 e;
    public int f13207f;

    public y(a0 a0Var, kd.c cVar) {
        super(cVar);
        this.e = a0Var;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.f13207f |= Integer.MIN_VALUE;
        return this.e.i(null, null, this);
    }
}
