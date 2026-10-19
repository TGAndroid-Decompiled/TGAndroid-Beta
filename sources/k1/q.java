package k1;

import java.io.Serializable;
import java.util.Iterator;
public final class q extends md.c {
    public z f14594a;
    public Object f14595b;
    public Serializable f14596c;
    public Object d;
    public s e;
    public Iterator f14597f;
    public Object h;
    public final z f14598n;
    public int f14599r;

    public q(z zVar, md.c cVar) {
        super(cVar);
        this.f14598n = zVar;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.h = obj;
        this.f14599r |= Integer.MIN_VALUE;
        return this.f14598n.c(this);
    }
}
