package k1;

import java.io.Serializable;
import java.util.Iterator;
public final class r extends kd.c {
    public a0 f14327a;
    public Object f14328b;
    public Serializable f14329c;
    public Object d;
    public t f14330e;
    public Iterator f14331f;
    public Object h;
    public final a0 f14332n;
    public int f14333r;

    public r(a0 a0Var, kd.c cVar) {
        super(cVar);
        this.f14332n = a0Var;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.h = obj;
        this.f14333r |= Integer.MIN_VALUE;
        return this.f14332n.c(this);
    }
}
