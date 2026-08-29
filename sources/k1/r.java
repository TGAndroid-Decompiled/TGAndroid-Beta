package k1;

import java.io.Serializable;
import java.util.Iterator;
public final class r extends uc.c {
    public a0 f13288a;
    public Object f13289b;
    public Serializable f13290c;
    public Object d;
    public t f13291e;
    public Iterator f13292f;
    public Object h;
    public final a0 f13293n;
    public int f13294r;

    public r(a0 a0Var, uc.c cVar) {
        super(cVar);
        this.f13293n = a0Var;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.h = obj;
        this.f13294r |= Integer.MIN_VALUE;
        return this.f13293n.c(this);
    }
}
