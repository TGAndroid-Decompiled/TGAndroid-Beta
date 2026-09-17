package ce;

import n4.y;
public final class d extends kd.c {
    public Object f4789a;
    public int f4790b;
    public final y f4791c;
    public y d;
    public c f4792e;

    public d(y yVar, kd.c cVar) {
        super(cVar);
        this.f4791c = yVar;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f4789a = obj;
        this.f4790b |= Integer.MIN_VALUE;
        return this.f4791c.z(null, this);
    }
}
