package bb;

import java.util.Iterator;
import java.util.Map;
public final class b extends md.c {
    public Map f4237a;
    public Iterator f4238b;
    public d f4239c;
    public ke.d d;
    public Map e;
    public Object f4240f;
    public Object h;
    public final c f4241n;
    public int f4242r;

    public b(c cVar, md.c cVar2) {
        super(cVar2);
        this.f4241n = cVar;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.h = obj;
        this.f4242r |= Integer.MIN_VALUE;
        return this.f4241n.b(this);
    }
}
