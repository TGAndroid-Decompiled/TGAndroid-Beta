package od;

import n7.qa;
public final class d extends wc.c {
    public Object f16529a;
    public int f16530b;
    public final qa f16531c;
    public qa d;
    public c e;

    public d(qa qaVar, wc.c cVar) {
        super(cVar);
        this.f16531c = qaVar;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f16529a = obj;
        this.f16530b |= Integer.MIN_VALUE;
        return this.f16531c.z(null, this);
    }
}
