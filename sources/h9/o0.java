package h9;

import j$.util.Objects;
import java.util.Iterator;
public final class o0 extends h2 {
    public int f14358a;
    public Object f14359b;
    public final Iterator f14360c;

    public o0(h2 h2Var) {
        this.f14360c = h2Var;
    }

    @Override
    public final boolean hasNext() {
        if (this.f14358a <= 0 && !this.f14360c.hasNext()) {
            return false;
        }
        return true;
    }

    @Override
    public final Object next() {
        if (this.f14358a <= 0) {
            p1 p1Var = (p1) this.f14360c.next();
            this.f14359b = p1Var.f14367a;
            this.f14358a = p1Var.a();
        }
        this.f14358a--;
        Object obj = this.f14359b;
        Objects.requireNonNull(obj);
        return obj;
    }
}
