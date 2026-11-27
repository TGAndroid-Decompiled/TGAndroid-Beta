package defpackage;
public final class xba extends ax2 {
    public Object a;
    public final yba b;
    public int c;

    public xba(yba ybaVar, ax2 ax2Var) {
        super(ax2Var);
        this.b = ybaVar;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.c(null, this);
    }
}
