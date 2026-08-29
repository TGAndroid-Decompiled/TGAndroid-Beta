package k1;
public final class v extends uc.c {
    public a0 f13307a;
    public Object f13308b;
    public final a0 f13309c;
    public int d;

    public v(a0 a0Var, uc.c cVar) {
        super(cVar);
        this.f13309c = a0Var;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f13308b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.f13309c.f(this);
    }
}
