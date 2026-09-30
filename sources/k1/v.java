package k1;
public final class v extends kd.c {
    public a0 f13195a;
    public Object f13196b;
    public final a0 f13197c;
    public int d;

    public v(a0 a0Var, kd.c cVar) {
        super(cVar);
        this.f13197c = a0Var;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f13196b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.f13197c.f(this);
    }
}
