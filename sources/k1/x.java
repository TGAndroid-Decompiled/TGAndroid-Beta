package k1;
public final class x extends uc.c {
    public Object f13314a;
    public Object f13315b;
    public Object f13316c;
    public final a0 d;
    public int f13317e;

    public x(a0 a0Var, uc.c cVar) {
        super(cVar);
        this.d = a0Var;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f13316c = obj;
        this.f13317e |= Integer.MIN_VALUE;
        return this.d.h(this);
    }
}
