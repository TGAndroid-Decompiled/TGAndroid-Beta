package defpackage;
public final class x9a extends ax2 {
    public Object a;
    public final y9a b;
    public int c;

    public x9a(y9a y9aVar, ax2 ax2Var) {
        super(ax2Var);
        this.b = y9aVar;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.a(this);
    }
}
