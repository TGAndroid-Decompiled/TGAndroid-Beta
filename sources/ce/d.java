package ce;

import n4.y;
public final class d extends kd.c {
    public Object f4230a;
    public int f4231b;
    public final y f4232c;
    public y d;
    public c e;

    public d(y yVar, kd.c cVar) {
        super(cVar);
        this.f4232c = yVar;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f4230a = obj;
        this.f4231b |= Integer.MIN_VALUE;
        return this.f4232c.l(null, this);
    }
}
