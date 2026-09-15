package ab;

import java.util.Iterator;
import java.util.Map;
public final class b extends kd.c {
    public Map f364a;
    public Iterator f365b;
    public d f366c;
    public ie.d d;
    public Map e;
    public Object f367f;
    public Object h;
    public final c f368n;
    public int f369r;

    public b(c cVar, kd.c cVar2) {
        super(cVar2);
        this.f368n = cVar;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.h = obj;
        this.f369r |= Integer.MIN_VALUE;
        return this.f368n.b(this);
    }
}
