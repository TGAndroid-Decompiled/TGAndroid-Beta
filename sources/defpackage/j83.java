package defpackage;

import java.io.Serializable;
public final class j83 extends ax2 {
    public Object a;
    public Object b;
    public Serializable c;
    public p89 d;
    public boolean e;
    public int f;
    public Object h;
    public final o83 n;
    public int r;

    public j83(o83 o83Var, ax2 ax2Var) {
        super(ax2Var);
        this.n = o83Var;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.h = obj;
        this.r |= Integer.MIN_VALUE;
        return this.n.h(false, this);
    }
}
