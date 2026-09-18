package k1;

import java.io.Serializable;
import java.util.Iterator;
public final class r extends kd.c {
    public a0 f13189a;
    public Object f13190b;
    public Serializable f13191c;
    public Object d;
    public t e;
    public Iterator f13192f;
    public Object h;
    public final a0 f13193n;
    public int f13194r;

    public r(a0 a0Var, kd.c cVar) {
        super(cVar);
        this.f13193n = a0Var;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.h = obj;
        this.f13194r |= Integer.MIN_VALUE;
        return this.f13193n.d(this);
    }
}
