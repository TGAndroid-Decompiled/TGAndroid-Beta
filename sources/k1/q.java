package k1;

import java.io.Serializable;
import java.util.Iterator;
public final class q extends ed.c {
    public z f10551a;
    public Object f10552b;
    public Serializable f10553c;
    public Object d;
    public s e;
    public Iterator f10554f;
    public Object h;
    public final z f10555n;
    public int f10556r;

    public q(z zVar, ed.c cVar) {
        super(cVar);
        this.f10555n = zVar;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.h = obj;
        this.f10556r |= Integer.MIN_VALUE;
        return this.f10555n.c(this);
    }
}
