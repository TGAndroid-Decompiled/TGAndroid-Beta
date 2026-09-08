package k1;
public final class v extends kd.c {
    public a0 f14516a;
    public Object f14517b;
    public final a0 f14518c;
    public int d;

    public v(a0 a0Var, kd.c cVar) {
        super(cVar);
        this.f14518c = a0Var;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f14517b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.f14518c.e(this);
    }
}
