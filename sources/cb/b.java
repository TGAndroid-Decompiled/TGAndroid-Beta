package cb;

import java.util.Iterator;
import java.util.Map;
public final class b extends nd.c {
    public Map f6173a;
    public Iterator f6174b;
    public d f6175c;
    public le.d d;
    public Map e;
    public Object f6176f;
    public Object h;
    public final c f6177n;
    public int f6178r;

    public b(c cVar, nd.c cVar2) {
        super(cVar2);
        this.f6177n = cVar;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.h = obj;
        this.f6178r |= Integer.MIN_VALUE;
        return this.f6177n.b(this);
    }
}
