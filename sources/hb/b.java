package hb;

import java.util.Iterator;
import java.util.Map;
public final class b extends kd.c {
    public Map f13800a;
    public Iterator f13801b;
    public d f13802c;
    public Map d;
    public Object f13803e;
    public Object f13804f;
    public final c h;
    public int f13805n;

    public b(c cVar, kd.c cVar2) {
        super(cVar2);
        this.h = cVar;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f13804f = obj;
        this.f13805n |= Integer.MIN_VALUE;
        return this.h.b(this);
    }
}
