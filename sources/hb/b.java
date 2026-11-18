package hb;

import java.util.Iterator;
import java.util.Map;
public final class b extends kd.c {
    public Map f14114a;
    public Iterator f14115b;
    public d f14116c;
    public Map d;
    public Object f14117e;
    public Object f14118f;
    public final c h;
    public int f14119n;

    public b(c cVar, kd.c cVar2) {
        super(cVar2);
        this.h = cVar;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f14118f = obj;
        this.f14119n |= Integer.MIN_VALUE;
        return this.h.b(this);
    }
}
