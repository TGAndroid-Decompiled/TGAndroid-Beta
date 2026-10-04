package k1;

import java.io.Serializable;
import java.util.Iterator;
public final class r extends kd.c {
    public a0 f14328a;
    public Object f14329b;
    public Serializable f14330c;
    public Object d;
    public t f14331e;
    public Iterator f14332f;
    public Object h;
    public final a0 f14333n;
    public int f14334r;

    public r(a0 a0Var, kd.c cVar) {
        super(cVar);
        this.f14333n = a0Var;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.h = obj;
        this.f14334r |= Integer.MIN_VALUE;
        return this.f14333n.c(this);
    }
}
