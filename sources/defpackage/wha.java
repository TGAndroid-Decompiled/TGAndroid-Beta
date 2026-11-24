package defpackage;
public final class wha extends qx2 {
    public xha a;
    public Object b;
    public final xha c;
    public int d;

    public wha(xha xhaVar, qx2 qx2Var) {
        super(qx2Var);
        this.c = xhaVar;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.a(null, this);
    }
}
