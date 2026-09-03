package ma;

import java.util.Iterator;
import java.util.Map;
public final class b extends wc.c {
    public Map f13872a;
    public Iterator f13873b;
    public d f13874c;
    public ud.d d;
    public Map e;
    public Object f13875f;
    public Object h;
    public final c f13876n;
    public int f13877r;

    public b(c cVar, wc.c cVar2) {
        super(cVar2);
        this.f13876n = cVar;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.h = obj;
        this.f13877r |= Integer.MIN_VALUE;
        return this.f13876n.b(this);
    }
}
