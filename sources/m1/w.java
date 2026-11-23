package m1;

import java.io.Serializable;
public final class w extends kd.c {
    public Object f20449a;
    public Object f20450b;
    public Serializable f20451c;
    public kotlin.jvm.internal.r d;
    public boolean f20452e;
    public int f20453f;
    public Object h;
    public final b0 f20454n;
    public int f20455r;

    public w(b0 b0Var, kd.c cVar) {
        super(cVar);
        this.f20454n = b0Var;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.h = obj;
        this.f20455r |= Integer.MIN_VALUE;
        return b0.f(this.f20454n, false, this);
    }
}
