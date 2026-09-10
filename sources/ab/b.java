package ab;

import java.util.Iterator;
import java.util.Map;
public final class b extends kd.c {
    public Map f362a;
    public Iterator f363b;
    public d f364c;
    public ie.d d;
    public Map e;
    public Object f365f;
    public Object h;
    public final c f366n;
    public int f367r;

    public b(c cVar, kd.c cVar2) {
        super(cVar2);
        this.f366n = cVar;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.h = obj;
        this.f367r |= Integer.MIN_VALUE;
        return this.f366n.b(this);
    }
}
