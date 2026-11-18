package m1;

import java.io.Serializable;
public final class w extends kd.c {
    public Object f20455a;
    public Object f20456b;
    public Serializable f20457c;
    public kotlin.jvm.internal.r d;
    public boolean f20458e;
    public int f20459f;
    public Object h;
    public final b0 f20460n;
    public int f20461r;

    public w(b0 b0Var, kd.c cVar) {
        super(cVar);
        this.f20460n = b0Var;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.h = obj;
        this.f20461r |= Integer.MIN_VALUE;
        return b0.f(this.f20460n, false, this);
    }
}
