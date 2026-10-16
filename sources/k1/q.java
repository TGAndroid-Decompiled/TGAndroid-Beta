package k1;

import java.io.Serializable;
import java.util.Iterator;
public final class q extends md.c {
    public z f13795a;
    public Object f13796b;
    public Serializable f13797c;
    public Object d;
    public s e;
    public Iterator f13798f;
    public Object h;
    public final z f13799n;
    public int f13800r;

    public q(z zVar, md.c cVar) {
        super(cVar);
        this.f13799n = zVar;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.h = obj;
        this.f13800r |= Integer.MIN_VALUE;
        return this.f13799n.d(this);
    }
}
