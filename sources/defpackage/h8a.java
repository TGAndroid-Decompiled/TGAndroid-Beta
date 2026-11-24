package defpackage;
public final class h8a extends qx2 {
    public Object a;
    public final i8a b;
    public int c;

    public h8a(i8a i8aVar, qx2 qx2Var) {
        super(qx2Var);
        this.b = i8aVar;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.a(this);
    }
}
