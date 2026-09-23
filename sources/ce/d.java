package ce;

import n4.y;
public final class d extends kd.c {
    public Object f4222a;
    public int f4223b;
    public final y f4224c;
    public y d;
    public c e;

    public d(y yVar, kd.c cVar) {
        super(cVar);
        this.f4224c = yVar;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f4222a = obj;
        this.f4223b |= Integer.MIN_VALUE;
        return this.f4224c.H(null, this);
    }
}
