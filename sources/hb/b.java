package hb;

import java.util.Iterator;
import java.util.Map;
public final class b extends kd.c {
    public Map f14109a;
    public Iterator f14110b;
    public d f14111c;
    public Map d;
    public Object f14112e;
    public Object f14113f;
    public final c h;
    public int f14114n;

    public b(c cVar, kd.c cVar2) {
        super(cVar2);
        this.h = cVar;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f14113f = obj;
        this.f14114n |= Integer.MIN_VALUE;
        return this.h.b(this);
    }
}
