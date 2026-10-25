package k1;

import java.io.Serializable;
import java.util.Iterator;
public final class q extends nd.c {
    public z f16073a;
    public Object f16074b;
    public Serializable f16075c;
    public Object d;
    public s e;
    public Iterator f16076f;
    public Object h;
    public final z f16077n;
    public int f16078r;

    public q(z zVar, nd.c cVar) {
        super(cVar);
        this.f16077n = zVar;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.h = obj;
        this.f16078r |= Integer.MIN_VALUE;
        return this.f16077n.c(this);
    }
}
