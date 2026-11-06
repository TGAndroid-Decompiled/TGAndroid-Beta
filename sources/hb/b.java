package hb;

import java.util.Iterator;
import java.util.Map;
public final class b extends kd.c {
    public Map f14443a;
    public Iterator f14444b;
    public d f14445c;
    public Map d;
    public Object f14446e;
    public Object f14447f;
    public final c h;
    public int f14448n;

    public b(c cVar, kd.c cVar2) {
        super(cVar2);
        this.h = cVar;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f14447f = obj;
        this.f14448n |= Integer.MIN_VALUE;
        return this.h.b(this);
    }
}
