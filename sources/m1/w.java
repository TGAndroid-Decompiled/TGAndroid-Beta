package m1;

import java.io.Serializable;
public final class w extends kd.c {
    public Object f19499a;
    public Object f19500b;
    public Serializable f19501c;
    public kotlin.jvm.internal.r d;
    public boolean f19502e;
    public int f19503f;
    public Object h;
    public final b0 f19504n;
    public int f19505r;

    public w(b0 b0Var, kd.c cVar) {
        super(cVar);
        this.f19504n = b0Var;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.h = obj;
        this.f19505r |= Integer.MIN_VALUE;
        return b0.f(this.f19504n, false, this);
    }
}
