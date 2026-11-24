package defpackage;
public final class gq9 extends qx2 {
    public e7a a;
    public qj7 b;
    public Object c;
    public final e7a d;
    public int e;

    public gq9(e7a e7aVar, qx2 qx2Var) {
        super(qx2Var);
        this.d = e7aVar;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.e |= Integer.MIN_VALUE;
        return this.d.F(this);
    }
}
