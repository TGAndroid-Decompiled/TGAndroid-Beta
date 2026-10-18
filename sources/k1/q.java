package k1;

import java.io.Serializable;
import java.util.Iterator;
public final class q extends md.c {
    public z f14595a;
    public Object f14596b;
    public Serializable f14597c;
    public Object d;
    public s e;
    public Iterator f14598f;
    public Object h;
    public final z f14599n;
    public int f14600r;

    public q(z zVar, md.c cVar) {
        super(cVar);
        this.f14599n = zVar;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.h = obj;
        this.f14600r |= Integer.MIN_VALUE;
        return this.f14599n.d(this);
    }
}
