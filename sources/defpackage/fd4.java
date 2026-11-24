package defpackage;
public final class fd4 extends qx2 {
    public hd4 a;
    public oc4 b;
    public boolean c;
    public Object d;
    public final hd4 e;
    public int f;

    public fd4(hd4 hd4Var, qx2 qx2Var) {
        super(qx2Var);
        this.e = hd4Var;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.f |= Integer.MIN_VALUE;
        return this.e.a(null, this);
    }
}
