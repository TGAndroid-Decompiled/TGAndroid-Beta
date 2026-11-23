package m1;

import java.io.Serializable;
public final class w extends kd.c {
    public Object f20545a;
    public Object f20546b;
    public Serializable f20547c;
    public kotlin.jvm.internal.r d;
    public boolean f20548e;
    public int f20549f;
    public Object h;
    public final b0 f20550n;
    public int f20551r;

    public w(b0 b0Var, kd.c cVar) {
        super(cVar);
        this.f20550n = b0Var;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.h = obj;
        this.f20551r |= Integer.MIN_VALUE;
        return b0.f(this.f20550n, false, this);
    }
}
