package hb;

import java.util.Iterator;
import java.util.Map;
public final class b extends kd.c {
    public Map f14143a;
    public Iterator f14144b;
    public d f14145c;
    public Map d;
    public Object f14146e;
    public Object f14147f;
    public final c h;
    public int f14148n;

    public b(c cVar, kd.c cVar2) {
        super(cVar2);
        this.h = cVar;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f14147f = obj;
        this.f14148n |= Integer.MIN_VALUE;
        return this.h.b(this);
    }
}
