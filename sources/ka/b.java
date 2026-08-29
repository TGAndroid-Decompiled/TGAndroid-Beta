package ka;

import java.util.Iterator;
import java.util.Map;
public final class b extends uc.c {
    public Map f13588a;
    public Iterator f13589b;
    public d f13590c;
    public sd.d d;
    public Map f13591e;
    public Object f13592f;
    public Object h;
    public final c f13593n;
    public int f13594r;

    public b(c cVar, uc.c cVar2) {
        super(cVar2);
        this.f13593n = cVar;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.h = obj;
        this.f13594r |= Integer.MIN_VALUE;
        return this.f13593n.b(this);
    }
}
