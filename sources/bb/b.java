package bb;

import java.util.Iterator;
import java.util.Map;
public final class b extends md.c {
    public Map f2617a;
    public Iterator f2618b;
    public d f2619c;
    public ke.d d;
    public Map e;
    public Object f2620f;
    public Object h;
    public final c f2621n;
    public int f2622r;

    public b(c cVar, md.c cVar2) {
        super(cVar2);
        this.f2621n = cVar;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.h = obj;
        this.f2622r |= Integer.MIN_VALUE;
        return this.f2621n.b(this);
    }
}
