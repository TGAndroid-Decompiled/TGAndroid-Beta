package ma;

import java.util.Iterator;
import java.util.Map;
public final class b extends wc.c {
    public Map f13604a;
    public Iterator f13605b;
    public d f13606c;
    public ud.d d;
    public Map f13607e;
    public Object f13608f;
    public Object h;
    public final c f13609n;
    public int f13610r;

    public b(c cVar, wc.c cVar2) {
        super(cVar2);
        this.f13609n = cVar;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.h = obj;
        this.f13610r |= Integer.MIN_VALUE;
        return this.f13609n.b(this);
    }
}
