package hb;

import java.util.Iterator;
import java.util.Map;
public final class b extends kd.c {
    public Map f14445a;
    public Iterator f14446b;
    public d f14447c;
    public Map d;
    public Object f14448e;
    public Object f14449f;
    public final c h;
    public int f14450n;

    public b(c cVar, kd.c cVar2) {
        super(cVar2);
        this.h = cVar;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f14449f = obj;
        this.f14450n |= Integer.MIN_VALUE;
        return this.h.b(this);
    }
}
