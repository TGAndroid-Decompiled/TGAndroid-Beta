package h9;

import j$.util.Objects;
import java.util.Iterator;
public final class o0 extends h2 {
    public int f14356a;
    public Object f14357b;
    public final Iterator f14358c;

    public o0(h2 h2Var) {
        this.f14358c = h2Var;
    }

    @Override
    public final boolean hasNext() {
        if (this.f14356a <= 0 && !this.f14358c.hasNext()) {
            return false;
        }
        return true;
    }

    @Override
    public final Object next() {
        if (this.f14356a <= 0) {
            p1 p1Var = (p1) this.f14358c.next();
            this.f14357b = p1Var.f14365a;
            this.f14356a = p1Var.a();
        }
        this.f14356a--;
        Object obj = this.f14357b;
        Objects.requireNonNull(obj);
        return obj;
    }
}
