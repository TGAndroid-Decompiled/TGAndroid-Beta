package cb;

import java.util.Iterator;
import java.util.Map;
public final class b extends ed.c {
    public Map f4089a;
    public Iterator f4090b;
    public d f4091c;
    public ce.d d;
    public Map e;
    public Object f4092f;
    public Object h;
    public final c f4093n;
    public int f4094r;

    public b(c cVar, ed.c cVar2) {
        super(cVar2);
        this.f4093n = cVar;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.h = obj;
        this.f4094r |= Integer.MIN_VALUE;
        return this.f4093n.b(this);
    }
}
