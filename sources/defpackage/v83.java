package defpackage;
public final class v83 extends qx2 {
    public Object a;
    public h93 b;
    public nq2 c;
    public Object d;
    public final h93 e;
    public int f;

    public v83(h93 h93Var, qx2 qx2Var) {
        super(qx2Var);
        this.e = h93Var;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.f |= Integer.MIN_VALUE;
        return this.e.d(null, this);
    }
}
