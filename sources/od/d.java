package od;

import n7.qa;
public final class d extends wc.c {
    public Object f16547a;
    public int f16548b;
    public final qa f16549c;
    public qa d;
    public c e;

    public d(qa qaVar, wc.c cVar) {
        super(cVar);
        this.f16549c = qaVar;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f16547a = obj;
        this.f16548b |= Integer.MIN_VALUE;
        return this.f16549c.z(null, this);
    }
}
