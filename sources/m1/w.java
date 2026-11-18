package m1;

import java.io.Serializable;
public final class w extends kd.c {
    public Object f20452a;
    public Object f20453b;
    public Serializable f20454c;
    public kotlin.jvm.internal.r d;
    public boolean f20455e;
    public int f20456f;
    public Object h;
    public final b0 f20457n;
    public int f20458r;

    public w(b0 b0Var, kd.c cVar) {
        super(cVar);
        this.f20457n = b0Var;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.h = obj;
        this.f20458r |= Integer.MIN_VALUE;
        return b0.f(this.f20457n, false, this);
    }
}
