package hb;

import java.util.Iterator;
import java.util.Map;
public final class b extends kd.c {
    public Map f14117a;
    public Iterator f14118b;
    public d f14119c;
    public Map d;
    public Object f14120e;
    public Object f14121f;
    public final c h;
    public int f14122n;

    public b(c cVar, kd.c cVar2) {
        super(cVar2);
        this.h = cVar;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f14121f = obj;
        this.f14122n |= Integer.MIN_VALUE;
        return this.h.b(this);
    }
}
