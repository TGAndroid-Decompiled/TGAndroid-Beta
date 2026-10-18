package bb;

import java.util.Iterator;
import java.util.Map;
public final class b extends md.c {
    public Map f4234a;
    public Iterator f4235b;
    public d f4236c;
    public ke.d d;
    public Map e;
    public Object f4237f;
    public Object h;
    public final c f4238n;
    public int f4239r;

    public b(c cVar, md.c cVar2) {
        super(cVar2);
        this.f4238n = cVar;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.h = obj;
        this.f4239r |= Integer.MIN_VALUE;
        return this.f4238n.b(this);
    }
}
