package ce;

import n4.y;
public final class d extends kd.c {
    public Object f4231a;
    public int f4232b;
    public final y f4233c;
    public y d;
    public c e;

    public d(y yVar, kd.c cVar) {
        super(cVar);
        this.f4233c = yVar;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f4231a = obj;
        this.f4232b |= Integer.MIN_VALUE;
        return this.f4233c.s(null, this);
    }
}
