package k1;

import java.io.Serializable;
import java.util.Iterator;
public final class r extends kd.c {
    public a0 f14497a;
    public Object f14498b;
    public Serializable f14499c;
    public Object d;
    public t f14500e;
    public Iterator f14501f;
    public Object h;
    public final a0 f14502n;
    public int f14503r;

    public r(a0 a0Var, kd.c cVar) {
        super(cVar);
        this.f14502n = a0Var;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.h = obj;
        this.f14503r |= Integer.MIN_VALUE;
        return this.f14502n.c(this);
    }
}
