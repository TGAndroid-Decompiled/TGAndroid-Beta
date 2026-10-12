package k1;
public final class x extends ld.c {
    public Object f14387a;
    public Object f14388b;
    public Object f14389c;
    public final a0 d;
    public int f14390e;

    public x(a0 a0Var, ld.c cVar) {
        super(cVar);
        this.d = a0Var;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f14389c = obj;
        this.f14390e |= Integer.MIN_VALUE;
        return this.d.h(this);
    }
}
