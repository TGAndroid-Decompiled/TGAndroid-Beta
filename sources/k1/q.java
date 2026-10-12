package k1;

import java.io.Serializable;
import java.util.Iterator;
public final class q extends md.c {
    public z f13792a;
    public Object f13793b;
    public Serializable f13794c;
    public Object d;
    public s e;
    public Iterator f13795f;
    public Object h;
    public final z f13796n;
    public int f13797r;

    public q(z zVar, md.c cVar) {
        super(cVar);
        this.f13796n = zVar;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.h = obj;
        this.f13797r |= Integer.MIN_VALUE;
        return this.f13796n.d(this);
    }
}
