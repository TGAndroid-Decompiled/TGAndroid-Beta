package ab;

import java.util.Iterator;
import java.util.Map;
public final class b extends kd.c {
    public Map f393a;
    public Iterator f394b;
    public d f395c;
    public ie.d d;
    public Map f396e;
    public Object f397f;
    public Object h;
    public final c f398n;
    public int f399r;

    public b(c cVar, kd.c cVar2) {
        super(cVar2);
        this.f398n = cVar;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.h = obj;
        this.f399r |= Integer.MIN_VALUE;
        return this.f398n.b(this);
    }
}
