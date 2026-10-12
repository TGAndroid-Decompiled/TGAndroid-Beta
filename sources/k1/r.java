package k1;

import java.io.Serializable;
import java.util.Iterator;
public final class r extends ld.c {
    public a0 f14360a;
    public Object f14361b;
    public Serializable f14362c;
    public Object d;
    public t f14363e;
    public Iterator f14364f;
    public Object h;
    public final a0 f14365n;
    public int f14366r;

    public r(a0 a0Var, ld.c cVar) {
        super(cVar);
        this.f14365n = a0Var;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.h = obj;
        this.f14366r |= Integer.MIN_VALUE;
        return this.f14365n.d(this);
    }
}
