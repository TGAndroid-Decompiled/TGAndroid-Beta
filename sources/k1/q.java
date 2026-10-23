package k1;

import java.io.Serializable;
import java.util.Iterator;
public final class q extends md.c {
    public z f14640a;
    public Object f14641b;
    public Serializable f14642c;
    public Object d;
    public s e;
    public Iterator f14643f;
    public Object h;
    public final z f14644n;
    public int f14645r;

    public q(z zVar, md.c cVar) {
        super(cVar);
        this.f14644n = zVar;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.h = obj;
        this.f14645r |= Integer.MIN_VALUE;
        return this.f14644n.d(this);
    }
}
