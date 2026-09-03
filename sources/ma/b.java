package ma;

import java.util.Iterator;
import java.util.Map;
public final class b extends wc.c {
    public Map f13606a;
    public Iterator f13607b;
    public d f13608c;
    public ud.d d;
    public Map f13609e;
    public Object f13610f;
    public Object h;
    public final c f13611n;
    public int f13612r;

    public b(c cVar, wc.c cVar2) {
        super(cVar2);
        this.f13611n = cVar;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.h = obj;
        this.f13612r |= Integer.MIN_VALUE;
        return this.f13611n.b(this);
    }
}
