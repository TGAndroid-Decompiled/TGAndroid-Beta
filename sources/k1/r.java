package k1;

import java.io.Serializable;
import java.util.Iterator;
public final class r extends kd.c {
    public a0 f13186a;
    public Object f13187b;
    public Serializable f13188c;
    public Object d;
    public t e;
    public Iterator f13189f;
    public Object h;
    public final a0 f13190n;
    public int f13191r;

    public r(a0 a0Var, kd.c cVar) {
        super(cVar);
        this.f13190n = a0Var;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.h = obj;
        this.f13191r |= Integer.MIN_VALUE;
        return this.f13190n.c(this);
    }
}
