package ce;

import n4.y;
public final class d extends kd.c {
    public Object f4569a;
    public int f4570b;
    public final y f4571c;
    public y d;
    public c f4572e;

    public d(y yVar, kd.c cVar) {
        super(cVar);
        this.f4571c = yVar;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f4569a = obj;
        this.f4570b |= Integer.MIN_VALUE;
        return this.f4571c.d(null, this);
    }
}
