package k1;

import java.io.Serializable;
import java.util.Iterator;

public final class q extends tc.c {

    public z f14289a;

    public Object f14290b;

    public Serializable f14291c;
    public Object d;

    public s f14292e;

    public Iterator f14293f;
    public Object h;

    public final z f14294n;

    public int f14295r;

    public q(z zVar, tc.c cVar) {
        super(cVar);
        this.f14294n = zVar;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.h = obj;
        this.f14295r |= Integer.MIN_VALUE;
        return this.f14294n.d(this);
    }
}
