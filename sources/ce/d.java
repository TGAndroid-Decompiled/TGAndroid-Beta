package ce;

import n4.y;
public final class d extends kd.c {
    public Object f4229a;
    public int f4230b;
    public final y f4231c;
    public y d;
    public c e;

    public d(y yVar, kd.c cVar) {
        super(cVar);
        this.f4231c = yVar;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f4229a = obj;
        this.f4230b |= Integer.MIN_VALUE;
        return this.f4231c.u(null, this);
    }
}
