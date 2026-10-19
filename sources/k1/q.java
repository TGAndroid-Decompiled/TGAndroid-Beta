package k1;

import java.io.Serializable;
import java.util.Iterator;
public final class q extends md.c {
    public z f14596a;
    public Object f14597b;
    public Serializable f14598c;
    public Object d;
    public s e;
    public Iterator f14599f;
    public Object h;
    public final z f14600n;
    public int f14601r;

    public q(z zVar, md.c cVar) {
        super(cVar);
        this.f14600n = zVar;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.h = obj;
        this.f14601r |= Integer.MIN_VALUE;
        return this.f14600n.c(this);
    }
}
