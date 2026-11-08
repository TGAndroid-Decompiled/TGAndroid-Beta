package m1;

import java.io.Serializable;
public final class w extends kd.c {
    public Object f19494a;
    public Object f19495b;
    public Serializable f19496c;
    public kotlin.jvm.internal.r d;
    public boolean f19497e;
    public int f19498f;
    public Object h;
    public final b0 f19499n;
    public int f19500r;

    public w(b0 b0Var, kd.c cVar) {
        super(cVar);
        this.f19499n = b0Var;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.h = obj;
        this.f19500r |= Integer.MIN_VALUE;
        return b0.f(this.f19499n, false, this);
    }
}
