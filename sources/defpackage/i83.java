package defpackage;
public final class i83 extends qx2 {
    public e7a a;
    public Object b;
    public final e7a c;
    public int d;

    public i83(e7a e7aVar, qx2 qx2Var) {
        super(qx2Var);
        this.c = e7aVar;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.l(this);
    }
}
