package ce;

import n4.y;
public final class d extends kd.c {
    public Object f4568a;
    public int f4569b;
    public final y f4570c;
    public y d;
    public c f4571e;

    public d(y yVar, kd.c cVar) {
        super(cVar);
        this.f4570c = yVar;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f4568a = obj;
        this.f4569b |= Integer.MIN_VALUE;
        return this.f4570c.d(null, this);
    }
}
