package k1;

import java.io.Serializable;
import java.util.Iterator;
public final class q extends nd.c {
    public z f16072a;
    public Object f16073b;
    public Serializable f16074c;
    public Object d;
    public s e;
    public Iterator f16075f;
    public Object h;
    public final z f16076n;
    public int f16077r;

    public q(z zVar, nd.c cVar) {
        super(cVar);
        this.f16076n = zVar;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.h = obj;
        this.f16077r |= Integer.MIN_VALUE;
        return this.f16076n.c(this);
    }
}
