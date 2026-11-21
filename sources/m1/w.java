package m1;

import java.io.Serializable;
public final class w extends kd.c {
    public Object f20480a;
    public Object f20481b;
    public Serializable f20482c;
    public kotlin.jvm.internal.r d;
    public boolean f20483e;
    public int f20484f;
    public Object h;
    public final b0 f20485n;
    public int f20486r;

    public w(b0 b0Var, kd.c cVar) {
        super(cVar);
        this.f20485n = b0Var;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.h = obj;
        this.f20486r |= Integer.MIN_VALUE;
        return b0.f(this.f20485n, false, this);
    }
}
