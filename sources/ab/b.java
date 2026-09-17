package ab;

import java.util.Iterator;
import java.util.Map;
public final class b extends kd.c {
    public Map f390a;
    public Iterator f391b;
    public d f392c;
    public ie.d d;
    public Map f393e;
    public Object f394f;
    public Object h;
    public final c f395n;
    public int f396r;

    public b(c cVar, kd.c cVar2) {
        super(cVar2);
        this.f395n = cVar;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.h = obj;
        this.f396r |= Integer.MIN_VALUE;
        return this.f395n.b(this);
    }
}
