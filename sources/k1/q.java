package k1;

import java.io.Serializable;
import java.util.Iterator;
public final class q extends ed.c {
    public z f10552a;
    public Object f10553b;
    public Serializable f10554c;
    public Object d;
    public s e;
    public Iterator f10555f;
    public Object h;
    public final z f10556n;
    public int f10557r;

    public q(z zVar, ed.c cVar) {
        super(cVar);
        this.f10556n = zVar;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.h = obj;
        this.f10557r |= Integer.MIN_VALUE;
        return this.f10556n.c(this);
    }
}
