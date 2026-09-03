package od;

import n7.qa;
public final class d extends wc.c {
    public Object f16717a;
    public int f16718b;
    public final qa f16719c;
    public qa d;
    public c f16720e;

    public d(qa qaVar, wc.c cVar) {
        super(cVar);
        this.f16719c = qaVar;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f16717a = obj;
        this.f16718b |= Integer.MIN_VALUE;
        return this.f16719c.x(null, this);
    }
}
