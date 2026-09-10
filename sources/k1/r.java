package k1;

import java.io.Serializable;
import java.util.Iterator;
public final class r extends kd.c {
    public a0 f12033a;
    public Object f12034b;
    public Serializable f12035c;
    public Object d;
    public t e;
    public Iterator f12036f;
    public Object h;
    public final a0 f12037n;
    public int f12038r;

    public r(a0 a0Var, kd.c cVar) {
        super(cVar);
        this.f12037n = a0Var;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.h = obj;
        this.f12038r |= Integer.MIN_VALUE;
        return this.f12037n.c(this);
    }
}
