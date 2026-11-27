package defpackage;
public final class wba extends ax2 {
    public Object a;
    public final xba b;
    public int c;

    public wba(xba xbaVar, ax2 ax2Var) {
        super(ax2Var);
        this.b = xbaVar;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.c(null, this);
    }
}
