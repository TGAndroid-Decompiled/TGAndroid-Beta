package ce;

import n4.y;
public final class d extends kd.c {
    public Object f4225a;
    public int f4226b;
    public final y f4227c;
    public y d;
    public c e;

    public d(y yVar, kd.c cVar) {
        super(cVar);
        this.f4227c = yVar;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f4225a = obj;
        this.f4226b |= Integer.MIN_VALUE;
        return this.f4227c.H(null, this);
    }
}
