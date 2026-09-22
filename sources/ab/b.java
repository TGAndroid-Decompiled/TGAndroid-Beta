package ab;

import java.util.Iterator;
import java.util.Map;
public final class b extends kd.c {
    public Map f366a;
    public Iterator f367b;
    public d f368c;
    public ie.d d;
    public Map e;
    public Object f369f;
    public Object h;
    public final c f370n;
    public int f371r;

    public b(c cVar, kd.c cVar2) {
        super(cVar2);
        this.f370n = cVar;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.h = obj;
        this.f371r |= Integer.MIN_VALUE;
        return this.f370n.b(this);
    }
}
