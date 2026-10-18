package k1;

import java.io.Serializable;
import java.util.Iterator;
public final class q extends md.c {
    public z f14597a;
    public Object f14598b;
    public Serializable f14599c;
    public Object d;
    public s e;
    public Iterator f14600f;
    public Object h;
    public final z f14601n;
    public int f14602r;

    public q(z zVar, md.c cVar) {
        super(cVar);
        this.f14601n = zVar;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.h = obj;
        this.f14602r |= Integer.MIN_VALUE;
        return this.f14601n.d(this);
    }
}
