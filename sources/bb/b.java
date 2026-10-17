package bb;

import java.util.Iterator;
import java.util.Map;
public final class b extends md.c {
    public Map f4233a;
    public Iterator f4234b;
    public d f4235c;
    public ke.d d;
    public Map e;
    public Object f4236f;
    public Object h;
    public final c f4237n;
    public int f4238r;

    public b(c cVar, md.c cVar2) {
        super(cVar2);
        this.f4237n = cVar;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.h = obj;
        this.f4238r |= Integer.MIN_VALUE;
        return this.f4237n.b(this);
    }
}
