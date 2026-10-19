package bb;

import java.util.Iterator;
import java.util.Map;
public final class b extends md.c {
    public Map f4230a;
    public Iterator f4231b;
    public d f4232c;
    public ke.d d;
    public Map e;
    public Object f4233f;
    public Object h;
    public final c f4234n;
    public int f4235r;

    public b(c cVar, md.c cVar2) {
        super(cVar2);
        this.f4234n = cVar;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.h = obj;
        this.f4235r |= Integer.MIN_VALUE;
        return this.f4234n.b(this);
    }
}
