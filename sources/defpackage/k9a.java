package defpackage;
public final class k9a extends qx2 {
    public Object a;
    public final l9a b;
    public int c;

    public k9a(l9a l9aVar, qx2 qx2Var) {
        super(qx2Var);
        this.b = l9aVar;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.b(this);
    }
}
