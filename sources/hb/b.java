package hb;

import java.util.Iterator;
import java.util.Map;
public final class b extends kd.c {
    public Map f14146a;
    public Iterator f14147b;
    public d f14148c;
    public Map d;
    public Object f14149e;
    public Object f14150f;
    public final c h;
    public int f14151n;

    public b(c cVar, kd.c cVar2) {
        super(cVar2);
        this.h = cVar;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f14150f = obj;
        this.f14151n |= Integer.MIN_VALUE;
        return this.h.b(this);
    }
}
