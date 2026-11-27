package defpackage;
public final class aba extends ax2 {
    public Object a;
    public final bba b;
    public int c;

    public aba(bba bbaVar, ax2 ax2Var) {
        super(ax2Var);
        this.b = bbaVar;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.b(this);
    }
}
