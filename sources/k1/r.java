package k1;

import java.io.Serializable;
import java.util.Iterator;
public final class r extends kd.c {
    public a0 f13181a;
    public Object f13182b;
    public Serializable f13183c;
    public Object d;
    public t e;
    public Iterator f13184f;
    public Object h;
    public final a0 f13185n;
    public int f13186r;

    public r(a0 a0Var, kd.c cVar) {
        super(cVar);
        this.f13185n = a0Var;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.h = obj;
        this.f13186r |= Integer.MIN_VALUE;
        return this.f13185n.d(this);
    }
}
