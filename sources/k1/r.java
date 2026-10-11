package k1;

import java.io.Serializable;
import java.util.Iterator;
public final class r extends ld.c {
    public a0 f14363a;
    public Object f14364b;
    public Serializable f14365c;
    public Object d;
    public t f14366e;
    public Iterator f14367f;
    public Object h;
    public final a0 f14368n;
    public int f14369r;

    public r(a0 a0Var, ld.c cVar) {
        super(cVar);
        this.f14368n = a0Var;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.h = obj;
        this.f14369r |= Integer.MIN_VALUE;
        return this.f14368n.d(this);
    }
}
