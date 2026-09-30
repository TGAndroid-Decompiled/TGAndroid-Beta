package k1;

import java.io.Serializable;
import java.util.Iterator;
public final class r extends kd.c {
    public a0 f13193a;
    public Object f13194b;
    public Serializable f13195c;
    public Object d;
    public t e;
    public Iterator f13196f;
    public Object h;
    public final a0 f13197n;
    public int f13198r;

    public r(a0 a0Var, kd.c cVar) {
        super(cVar);
        this.f13197n = a0Var;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.h = obj;
        this.f13198r |= Integer.MIN_VALUE;
        return this.f13197n.d(this);
    }
}
