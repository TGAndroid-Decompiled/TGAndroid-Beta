package ab;

import java.util.Iterator;
import java.util.Map;
public final class b extends ld.c {
    public Map f391a;
    public Iterator f392b;
    public d f393c;
    public je.d d;
    public Map f394e;
    public Object f395f;
    public Object h;
    public final c f396n;
    public int f397r;

    public b(c cVar, ld.c cVar2) {
        super(cVar2);
        this.f396n = cVar;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.h = obj;
        this.f397r |= Integer.MIN_VALUE;
        return this.f396n.b(this);
    }
}
