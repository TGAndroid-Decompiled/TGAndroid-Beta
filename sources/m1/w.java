package m1;

import java.io.Serializable;
public final class w extends kd.c {
    public Object f20088a;
    public Object f20089b;
    public Serializable f20090c;
    public kotlin.jvm.internal.r d;
    public boolean f20091e;
    public int f20092f;
    public Object h;
    public final b0 f20093n;
    public int f20094r;

    public w(b0 b0Var, kd.c cVar) {
        super(cVar);
        this.f20093n = b0Var;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.h = obj;
        this.f20094r |= Integer.MIN_VALUE;
        return b0.f(this.f20093n, false, this);
    }
}
