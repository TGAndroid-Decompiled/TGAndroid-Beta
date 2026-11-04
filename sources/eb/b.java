package eb;

import java.util.Iterator;
import java.util.Map;
public final class b extends hd.c {
    public Map f9919a;
    public Iterator f9920b;
    public d f9921c;
    public Map d;
    public Object f9922e;
    public Object f9923f;
    public final c h;
    public int f9924n;

    public b(c cVar, hd.c cVar2) {
        super(cVar2);
        this.h = cVar;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f9923f = obj;
        this.f9924n |= Integer.MIN_VALUE;
        return this.h.b(this);
    }
}
