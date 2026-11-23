package m1;

import java.io.Serializable;
public final class w extends kd.c {
    public Object f20483a;
    public Object f20484b;
    public Serializable f20485c;
    public kotlin.jvm.internal.r d;
    public boolean f20486e;
    public int f20487f;
    public Object h;
    public final b0 f20488n;
    public int f20489r;

    public w(b0 b0Var, kd.c cVar) {
        super(cVar);
        this.f20488n = b0Var;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.h = obj;
        this.f20489r |= Integer.MIN_VALUE;
        return b0.f(this.f20488n, false, this);
    }
}
