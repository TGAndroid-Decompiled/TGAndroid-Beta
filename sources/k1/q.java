package k1;

import java.io.Serializable;
import java.util.Iterator;
public final class q extends md.c {
    public z f14590a;
    public Object f14591b;
    public Serializable f14592c;
    public Object d;
    public s e;
    public Iterator f14593f;
    public Object h;
    public final z f14594n;
    public int f14595r;

    public q(z zVar, md.c cVar) {
        super(cVar);
        this.f14594n = zVar;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.h = obj;
        this.f14595r |= Integer.MIN_VALUE;
        return this.f14594n.d(this);
    }
}
