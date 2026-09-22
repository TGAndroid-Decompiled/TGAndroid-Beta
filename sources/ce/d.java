package ce;

import n4.y;
public final class d extends kd.c {
    public Object f4227a;
    public int f4228b;
    public final y f4229c;
    public y d;
    public c e;

    public d(y yVar, kd.c cVar) {
        super(cVar);
        this.f4229c = yVar;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f4227a = obj;
        this.f4228b |= Integer.MIN_VALUE;
        return this.f4229c.H(null, this);
    }
}
