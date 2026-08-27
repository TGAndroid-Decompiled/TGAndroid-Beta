package ja;

import java.util.Iterator;
import java.util.Map;

public final class b extends tc.c {

    public Map f12867a;

    public Iterator f12868b;

    public d f12869c;
    public rd.d d;

    public Map f12870e;

    public Object f12871f;
    public Object h;

    public final c f12872n;

    public int f12873r;

    public b(c cVar, tc.c cVar2) {
        super(cVar2);
        this.f12872n = cVar;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.h = obj;
        this.f12873r |= Integer.MIN_VALUE;
        return this.f12872n.b(this);
    }
}
