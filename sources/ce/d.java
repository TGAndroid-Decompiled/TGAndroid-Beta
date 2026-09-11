package ce;

import n4.y;
public final class d extends kd.c {
    public Object f4762a;
    public int f4763b;
    public final y f4764c;
    public y d;
    public c f4765e;

    public d(y yVar, kd.c cVar) {
        super(cVar);
        this.f4764c = yVar;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f4762a = obj;
        this.f4763b |= Integer.MIN_VALUE;
        return this.f4764c.z(null, this);
    }
}
