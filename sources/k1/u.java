package k1;

import java.io.Serializable;
import java.util.Iterator;
public final class u extends wc.c {
    public d0 f9587a;
    public Object f9588b;
    public Serializable f9589c;
    public Object d;
    public w e;
    public Iterator f9590f;
    public Object h;
    public final d0 f9591n;
    public int f9592r;

    public u(d0 d0Var, wc.c cVar) {
        super(cVar);
        this.f9591n = d0Var;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.h = obj;
        this.f9592r |= Integer.MIN_VALUE;
        return this.f9591n.c(this);
    }
}
