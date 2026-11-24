package defpackage;

import java.io.Serializable;
public final class c93 extends qx2 {
    public Object a;
    public Object b;
    public Serializable c;
    public e79 d;
    public boolean e;
    public int f;
    public Object h;
    public final h93 n;
    public int r;

    public c93(h93 h93Var, qx2 qx2Var) {
        super(qx2Var);
        this.n = h93Var;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.h = obj;
        this.r |= Integer.MIN_VALUE;
        return this.n.h(false, this);
    }
}
