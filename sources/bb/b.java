package bb;

import java.util.Iterator;
import java.util.Map;
public final class b extends md.c {
    public Map f2621a;
    public Iterator f2622b;
    public d f2623c;
    public ke.d d;
    public Map e;
    public Object f2624f;
    public Object h;
    public final c f2625n;
    public int f2626r;

    public b(c cVar, md.c cVar2) {
        super(cVar2);
        this.f2625n = cVar;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.h = obj;
        this.f2626r |= Integer.MIN_VALUE;
        return this.f2625n.b(this);
    }
}
