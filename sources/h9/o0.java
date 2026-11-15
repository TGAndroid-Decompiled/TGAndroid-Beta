package h9;

import j$.util.Objects;
import java.util.Iterator;
public final class o0 extends g2 {
    public int f13714a;
    public Object f13715b;
    public final Iterator f13716c;

    public o0(g2 g2Var) {
        this.f13716c = g2Var;
    }

    @Override
    public final boolean hasNext() {
        if (this.f13714a <= 0 && !this.f13716c.hasNext()) {
            return false;
        }
        return true;
    }

    @Override
    public final Object next() {
        if (this.f13714a <= 0) {
            o1 o1Var = (o1) this.f13716c.next();
            this.f13715b = o1Var.f13717a;
            this.f13714a = o1Var.a();
        }
        this.f13714a--;
        Object obj = this.f13715b;
        Objects.requireNonNull(obj);
        return obj;
    }
}
