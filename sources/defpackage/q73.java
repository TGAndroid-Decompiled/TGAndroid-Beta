package defpackage;

import java.io.Serializable;
public final class q73 extends gw2 {
    public Object a;
    public Object b;
    public Serializable c;
    public c59 d;
    public boolean e;
    public int f;
    public Object h;
    public final v73 n;
    public int r;

    public q73(v73 v73Var, gw2 gw2Var) {
        super(gw2Var);
        this.n = v73Var;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.h = obj;
        this.r |= Integer.MIN_VALUE;
        return this.n.h(false, this);
    }
}
