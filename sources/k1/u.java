package k1;

import java.io.Serializable;
import java.util.Iterator;
public final class u extends wc.c {
    public d0 f9606a;
    public Object f9607b;
    public Serializable f9608c;
    public Object d;
    public w e;
    public Iterator f9609f;
    public Object h;
    public final d0 f9610n;
    public int f9611r;

    public u(d0 d0Var, wc.c cVar) {
        super(cVar);
        this.f9610n = d0Var;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.h = obj;
        this.f9611r |= Integer.MIN_VALUE;
        return this.f9610n.c(this);
    }
}
