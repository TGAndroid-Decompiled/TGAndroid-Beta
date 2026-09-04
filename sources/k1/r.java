package k1;

import java.io.Serializable;
import java.util.Iterator;
public final class r extends kd.c {
    public a0 f14471a;
    public Object f14472b;
    public Serializable f14473c;
    public Object d;
    public t f14474e;
    public Iterator f14475f;
    public Object h;
    public final a0 f14476n;
    public int f14477r;

    public r(a0 a0Var, kd.c cVar) {
        super(cVar);
        this.f14476n = a0Var;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.h = obj;
        this.f14477r |= Integer.MIN_VALUE;
        return this.f14476n.c(this);
    }
}
