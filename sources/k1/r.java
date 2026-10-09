package k1;

import java.io.Serializable;
import java.util.Iterator;
public final class r extends ld.c {
    public a0 f14364a;
    public Object f14365b;
    public Serializable f14366c;
    public Object d;
    public t f14367e;
    public Iterator f14368f;
    public Object h;
    public final a0 f14369n;
    public int f14370r;

    public r(a0 a0Var, ld.c cVar) {
        super(cVar);
        this.f14369n = a0Var;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.h = obj;
        this.f14370r |= Integer.MIN_VALUE;
        return this.f14369n.d(this);
    }
}
