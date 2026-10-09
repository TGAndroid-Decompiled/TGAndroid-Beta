package k1;
public final class x extends ld.c {
    public Object f14390a;
    public Object f14391b;
    public Object f14392c;
    public final a0 d;
    public int f14393e;

    public x(a0 a0Var, ld.c cVar) {
        super(cVar);
        this.d = a0Var;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f14392c = obj;
        this.f14393e |= Integer.MIN_VALUE;
        return this.d.h(this);
    }
}
