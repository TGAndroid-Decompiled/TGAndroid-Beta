package defpackage;
public final class j83 extends qx2 {
    public Object a;
    public Object b;
    public Object c;
    public e79 d;
    public h93 e;
    public Object f;
    public final k83 h;
    public int n;

    public j83(k83 k83Var, qx2 qx2Var) {
        super(qx2Var);
        this.h = k83Var;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f = obj;
        this.n |= Integer.MIN_VALUE;
        return this.h.a(null, this);
    }
}
