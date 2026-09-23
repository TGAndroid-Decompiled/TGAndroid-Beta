package k1;

import java.io.Serializable;
import java.util.Iterator;
public final class r extends kd.c {
    public a0 f13178a;
    public Object f13179b;
    public Serializable f13180c;
    public Object d;
    public t e;
    public Iterator f13181f;
    public Object h;
    public final a0 f13182n;
    public int f13183r;

    public r(a0 a0Var, kd.c cVar) {
        super(cVar);
        this.f13182n = a0Var;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.h = obj;
        this.f13183r |= Integer.MIN_VALUE;
        return this.f13182n.c(this);
    }
}
