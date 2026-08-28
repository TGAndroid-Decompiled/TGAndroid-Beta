package k1;

import java.io.Serializable;
import java.util.Iterator;
public final class q extends sc.c {
    public z f14468a;
    public Object f14469b;
    public Serializable f14470c;
    public Object d;
    public s f14471e;
    public Iterator f14472f;
    public Object h;
    public final z f14473n;
    public int f14474r;

    public q(z zVar, sc.c cVar) {
        super(cVar);
        this.f14473n = zVar;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.h = obj;
        this.f14474r |= Integer.MIN_VALUE;
        return this.f14473n.c(this);
    }
}
