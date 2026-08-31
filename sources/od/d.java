package od;

import n7.qa;
public final class d extends wc.c {
    public Object f16715a;
    public int f16716b;
    public final qa f16717c;
    public qa d;
    public c f16718e;

    public d(qa qaVar, wc.c cVar) {
        super(cVar);
        this.f16717c = qaVar;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f16715a = obj;
        this.f16716b |= Integer.MIN_VALUE;
        return this.f16717c.x(null, this);
    }
}
