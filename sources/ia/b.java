package ia;

import java.util.Iterator;
import java.util.Map;
public final class b extends sc.c {
    public Map f11065a;
    public Iterator f11066b;
    public d f11067c;
    public qd.d d;
    public Map f11068e;
    public Object f11069f;
    public Object h;
    public final c f11070n;
    public int f11071r;

    public b(c cVar, sc.c cVar2) {
        super(cVar2);
        this.f11070n = cVar;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.h = obj;
        this.f11071r |= Integer.MIN_VALUE;
        return this.f11070n.b(this);
    }
}
