package k1;
public final class y extends uc.c {
    public a0 f13318a;
    public Object f13319b;
    public Object f13320c;
    public Object d;
    public final a0 f13321e;
    public int f13322f;

    public y(a0 a0Var, uc.c cVar) {
        super(cVar);
        this.f13321e = a0Var;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.f13322f |= Integer.MIN_VALUE;
        return this.f13321e.i(null, null, this);
    }
}
