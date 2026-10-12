package k1;

import java.io.Serializable;
import java.util.Iterator;
public final class r extends ld.c {
    public a0 f14361a;
    public Object f14362b;
    public Serializable f14363c;
    public Object d;
    public t f14364e;
    public Iterator f14365f;
    public Object h;
    public final a0 f14366n;
    public int f14367r;

    public r(a0 a0Var, ld.c cVar) {
        super(cVar);
        this.f14366n = a0Var;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.h = obj;
        this.f14367r |= Integer.MIN_VALUE;
        return this.f14366n.d(this);
    }
}
