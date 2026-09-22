package ab;

import java.util.Iterator;
import java.util.Map;
public final class b extends kd.c {
    public Map f363a;
    public Iterator f364b;
    public d f365c;
    public ie.d d;
    public Map e;
    public Object f366f;
    public Object h;
    public final c f367n;
    public int f368r;

    public b(c cVar, kd.c cVar2) {
        super(cVar2);
        this.f367n = cVar;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.h = obj;
        this.f368r |= Integer.MIN_VALUE;
        return this.f367n.b(this);
    }
}
