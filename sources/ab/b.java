package ab;

import java.util.Iterator;
import java.util.Map;
public final class b extends kd.c {
    public Map f378a;
    public Iterator f379b;
    public d f380c;
    public ie.d d;
    public Map f381e;
    public Object f382f;
    public Object h;
    public final c f383n;
    public int f384r;

    public b(c cVar, kd.c cVar2) {
        super(cVar2);
        this.f383n = cVar;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.h = obj;
        this.f384r |= Integer.MIN_VALUE;
        return this.f383n.b(this);
    }
}
