package defpackage;
public final class w83 extends qx2 {
    public h93 a;
    public qj7 b;
    public Object c;
    public final h93 d;
    public int e;

    public w83(h93 h93Var, qx2 qx2Var) {
        super(qx2Var);
        this.d = h93Var;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.e |= Integer.MIN_VALUE;
        return this.d.e(this);
    }
}
