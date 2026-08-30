package ma;

import java.util.Iterator;
import java.util.Map;
public final class b extends wc.c {
    public Map f13888a;
    public Iterator f13889b;
    public d f13890c;
    public ud.d d;
    public Map e;
    public Object f13891f;
    public Object h;
    public final c f13892n;
    public int f13893r;

    public b(c cVar, wc.c cVar2) {
        super(cVar2);
        this.f13892n = cVar;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.h = obj;
        this.f13893r |= Integer.MIN_VALUE;
        return this.f13892n.b(this);
    }
}
