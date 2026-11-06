package m1;

import java.io.Serializable;
public final class w extends kd.c {
    public Object f19491a;
    public Object f19492b;
    public Serializable f19493c;
    public kotlin.jvm.internal.r d;
    public boolean f19494e;
    public int f19495f;
    public Object h;
    public final b0 f19496n;
    public int f19497r;

    public w(b0 b0Var, kd.c cVar) {
        super(cVar);
        this.f19496n = b0Var;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.h = obj;
        this.f19497r |= Integer.MIN_VALUE;
        return b0.f(this.f19496n, false, this);
    }
}
