package l1;

import java.io.Serializable;
public final class w extends hd.c {
    public Object f17654a;
    public Object f17655b;
    public Serializable f17656c;
    public kotlin.jvm.internal.r d;
    public boolean f17657e;
    public int f17658f;
    public Object h;
    public final b0 f17659n;
    public int f17660r;

    public w(b0 b0Var, hd.c cVar) {
        super(cVar);
        this.f17659n = b0Var;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.h = obj;
        this.f17660r |= Integer.MIN_VALUE;
        return b0.f(this.f17659n, false, this);
    }
}
