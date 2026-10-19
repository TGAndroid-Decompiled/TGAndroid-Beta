package bb;

import java.util.Iterator;
import java.util.Map;
public final class b extends md.c {
    public Map f4232a;
    public Iterator f4233b;
    public d f4234c;
    public ke.d d;
    public Map e;
    public Object f4235f;
    public Object h;
    public final c f4236n;
    public int f4237r;

    public b(c cVar, md.c cVar2) {
        super(cVar2);
        this.f4236n = cVar;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.h = obj;
        this.f4237r |= Integer.MIN_VALUE;
        return this.f4236n.b(this);
    }
}
