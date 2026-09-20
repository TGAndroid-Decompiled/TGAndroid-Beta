package k1;

import java.io.Serializable;
import java.util.Iterator;
public final class r extends kd.c {
    public a0 f13190a;
    public Object f13191b;
    public Serializable f13192c;
    public Object d;
    public t e;
    public Iterator f13193f;
    public Object h;
    public final a0 f13194n;
    public int f13195r;

    public r(a0 a0Var, kd.c cVar) {
        super(cVar);
        this.f13194n = a0Var;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.h = obj;
        this.f13195r |= Integer.MIN_VALUE;
        return this.f13194n.d(this);
    }
}
