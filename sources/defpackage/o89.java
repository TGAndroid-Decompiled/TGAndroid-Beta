package defpackage;
public final class o89 extends qx2 {
    public qj7 a;
    public Object b;
    public final p89 c;
    public int d;

    public o89(p89 p89Var, qx2 qx2Var) {
        super(qx2Var);
        this.c = p89Var;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.a(this);
    }
}
