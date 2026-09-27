package ce;

import n4.y;
public final class d extends kd.c {
    public Object f4224a;
    public int f4225b;
    public final y f4226c;
    public y d;
    public c e;

    public d(y yVar, kd.c cVar) {
        super(cVar);
        this.f4226c = yVar;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f4224a = obj;
        this.f4225b |= Integer.MIN_VALUE;
        return this.f4226c.H(null, this);
    }
}
