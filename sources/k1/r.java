package k1;

import java.io.Serializable;
import java.util.Iterator;
public final class r extends kd.c {
    public a0 f13188a;
    public Object f13189b;
    public Serializable f13190c;
    public Object d;
    public t e;
    public Iterator f13191f;
    public Object h;
    public final a0 f13192n;
    public int f13193r;

    public r(a0 a0Var, kd.c cVar) {
        super(cVar);
        this.f13192n = a0Var;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.h = obj;
        this.f13193r |= Integer.MIN_VALUE;
        return this.f13192n.c(this);
    }
}
