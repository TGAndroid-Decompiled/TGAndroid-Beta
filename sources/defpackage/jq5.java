package defpackage;
public final class jq5 extends qx2 {
    public Object a;
    public Object b;
    public final dhf c;
    public int d;

    public jq5(dhf dhfVar, qx2 qx2Var) {
        super(qx2Var);
        this.c = dhfVar;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.z(null, this);
    }
}
